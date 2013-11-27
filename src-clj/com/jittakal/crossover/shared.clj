(ns com.jittakal.crossover.shared
  (:require;*CLJSBUILD-REMOVE*;-macros
    [com.jittakal.crossover.macros :as macros]))

(defn make-example-text []
  (macros/reverse-eval
    ("code" "shared " "from the " "Hello " str)))
