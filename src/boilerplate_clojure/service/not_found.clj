(ns boilerplate-clojure.service.not-found
  (:require [compojure.core :refer [ANY]]
            [boilerplate-clojure.controller.not-found :as controller]
            [compojure.route :as route]))


(def not-found
  (ANY "*" [] (controller/not-found)))
