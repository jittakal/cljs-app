(ns com.jittakal.routes
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.util.response :as resp]
            [hiccup.middleware :only (wrap-base-url)]))

(defroutes main-routes
  (GET "/" [] (resp/resource-response "index.html" {:root "public"}))
  (GET "/repl-demo" [] (resp/resource-response "repldemo.html" {:root "public"}))
  (route/resources "/")
  (route/not-found (resp/resource-response "404.html" {:root "public"})))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))
