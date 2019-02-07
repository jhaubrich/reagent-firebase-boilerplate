(ns myproject.core
  (:require [reagent.core :as r]
            [myproject.fb.init :refer [firebase-init]]))

(defn app
  []
  [:div
   [:h1 {:style {:text-align "center" :padding "5em"}} "WAAS System Monitoring Slides Go Here"]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app"))
  (firebase-init))
