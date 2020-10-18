(ns boilerplate-clojure.controller.root
  (:require [boilerplate-clojure.controller.helpers.string-response :refer [ok]]))

(defn hello-world []
  (ok "Hello There\n"))
