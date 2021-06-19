(ns app.components.button
  (:require [reagent.core :as r]))

(defn button [text]
  (let [click-count (r/atom 0)]
    (fn []
      [:button.btn.btn-primary.btn-lg
       {:on-click #(swap! click-count inc)}
       text
       (when (pos? @click-count)
         (str " clicked " @click-count " times"))])))