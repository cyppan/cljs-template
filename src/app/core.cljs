(ns app.core
  (:require [reagent.dom :as rd]
            [app.components.button :refer [button]]))

(defn app []
  [:div.px-4.py-5.my-5.text-center
   [:h1.display-5.fw-bold "Let's code!"]
   [:div.col-lg-6.mx-auto
    [:p.lead.mb-4 "Rendered by Reagent"]
    [:div.d-grid.gap-2.d-sm-flex.justify-content-sm-center
     [button "Click me (please)"]]]])

(defn ^:export main
  []
  (rd/render
   [app]
   (.getElementById js/document "app")))