(ns com.jittakal.test.core
  (:use [com.jittakal.core :only [add-some-numbers]]))

(defn run []
  (assert (= (add-some-numbers 2 2) 4))
  (assert (= (add-some-numbers 1 2 3) 6))
  (assert (= (add-some-numbers 4 5 6) 15)))
