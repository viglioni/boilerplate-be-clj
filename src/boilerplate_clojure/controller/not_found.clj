(ns boilerplate-clojure.controller.not-found
  (:require [boilerplate-clojure.controller.helpers.string-response :as resp]))

(defn not-found []
  (resp/not-found "These aren't the droids you're looking for.\n"))
