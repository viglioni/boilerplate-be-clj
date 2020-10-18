(ns boilerplate-clojure.service.routes
  (:require [compojure.core :refer [defroutes]]
            [boilerplate-clojure.service.root :refer [root]]
            [boilerplate-clojure.service.health-check :refer [health-check]]
            [boilerplate-clojure.service.not-found :refer [not-found]]))

(defroutes app-routes
  root
  health-check
  not-found)

