(ns boilerplate-clojure.service.health-check
  (:require [compojure.core :refer [GET context]]
            [boilerplate-clojure.controller.health-check :as controller]))

(def health-check
  (context
   "/health-check" []
   (GET "/" [] (controller/health-check))))

