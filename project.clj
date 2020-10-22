(defproject boilerplate-clojure "1.0.0-SNAPSHOT"
  :description "Stocks web app"
  :author "Laura Viglioni"
  :year "2020"
  :url "https://github.com/Viglioni/boilerplate-clojure"
  :license {:name "GNU General Public License v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-devel "1.8.1"]
                 [ring/ring-defaults "0.3.2"]
                 [metosin/ring-http-response "0.9.1"]
                 [clj-time "0.15.2"]
                 [environ "1.1.0"]
                 [org.clojure/data.json "1.0.0"]
                 [ring/ring-mock "0.4.0"]
                 [ring/ring-json "0.5.0"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [mysql/mysql-connector-java "5.1.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]
            [lein-ring "0.12.5"]
            [lein-shell "0.5.0"]
            [lein-exec "0.3.7"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "boilerplate-clojure-standalone.jar"
  :ring {:handler boilerplate-clojure.server/run-dev}
  :main ^:skip-aot boilerplate-clojure.server
  :aliases {"test:watch" ["shell" "sh" "scripts/test_dev.sh"]
            "rename-project" ["shell" "sh" "scripts/rename-project.sh"]}

  :profiles {:uberjar {:aot :all}
             :production {:env {:production true}}})
