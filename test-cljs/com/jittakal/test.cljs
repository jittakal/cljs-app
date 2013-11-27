(ns com.jittakal.test
  (:require [com.jittakal.test.core :as hello]))

(def success 0)

(defn ^:export run []
  (.log js/console "Example test started.")
  (hello/run)
  success)
