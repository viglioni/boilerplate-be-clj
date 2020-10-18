(ns boilerplate-clojure.controller.helpers.string-response
  (:require [ring.util.http-response :as resp]))

(defn ok [str]
  (resp/content-type (resp/ok str) "text/html"))

(defn bad-request [str]
  (resp/content-type (resp/bad-request str) "text/html"))

(defn internal-server-error [str]
  (resp/content-type (resp/internal-server-error str) "text/html"))

(defn not-found [str]
  (resp/content-type (resp/not-found str) "text/html"))

