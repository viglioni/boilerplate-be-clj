#!bin/bash

function my_sed(){
  if [[ "$OSTYPE" == "linux-gnu"* ]]; then
    sed $@
  elif [[ "$OSTYPE" == "darwin"* ]]; then
    gsed $@
  fi
}

echo "hello there"
echo "What is the project name?"
read -p "" project_name

project_name_dir=${project_name//[- ]/_}
project_name_files=${project_name//[_ ]/-}

rm -rf ./target/*
mv "./src/boilerplate_clojure" "./src/$project_name_dir"
mv "./test/boilerplate_clojure" "./test/$project_name_dir"

for file in $(find ./src -iname "*.clj") $(find ./test -iname "*.clj")
do
  my_sed -i 's/boilerplate-clojure\./'"$project_name_files"'\./g' $file
done


for file in "./Procfile" "./project.clj"
do
  my_sed -i 's/boilerplate-clojure/'"$project_name_files"'/g'  $file
done


