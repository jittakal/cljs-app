;*CLJSBUILD-MACRO-FILE*;

(ns com.jittakal.crossover.macros)

(defmacro reverse-eval [form]
  (reverse form))
