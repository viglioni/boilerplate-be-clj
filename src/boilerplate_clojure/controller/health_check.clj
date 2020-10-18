(ns boilerplate-clojure.controller.health-check
  (:require [boilerplate-clojure.controller.helpers.string-response :refer [ok internal-server-error]]
            [boilerplate-clojure.controller.helpers.time :refer [date-and-time-hr]]))




(defn health-check []
  (try
    (ok (str "It's working! It's working!\n" (date-and-time-hr) "\n"))
    (catch Exception e
      (println (.getMessage e))
      (internal-server-error
       (str "I don't think the system works.\n" (date-and-time-hr) "\n")))))
