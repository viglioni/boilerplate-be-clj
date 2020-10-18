(ns boilerplate-clojure.service.root
  (:require [compojure.core :refer [GET context]]
            [boilerplate-clojure.controller.root :as controller]))

(def root
  (context
   "/" []
   (GET "/" [] (controller/hello-world))))
