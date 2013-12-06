(ns com.jittakal.core
  (:require [enfocus.core :as ef]
            [enfocus.effects :as effects]
            [enfocus.events :as ev])
  (:require-macros [enfocus.macros :as em]))

(em/deftemplate home "templates/home.html" [])

(em/defaction home-page []
              "#content-pane" (ef/do->
                          (ef/content (home))))

(em/deftemplate about "templates/about.html" [])

(em/defaction about-page []
              "#content-pane" (ef/do->
                          (ef/content (about))))

(em/defaction setup-app []
              "#home" (ev/listen
                       :click
                       #(home-page))
              "#about" (ev/listen
                        :click
                        #(about-page)))

(set! (.-onload js/window) (setup-app))
