(ns myproject.fb.init
  (:require ["firebase/app" :as firebase]
            ["firebase/database"]
            ["firebase/auth"]))

(defn firebase-init
  []
  (if (zero? (alength firebase/apps))
    (firebase/initializeApp
     #js   {:apiKey "YOURKEY"
            :authDomain "my-firebase-project.firebaseapp.com"
            :databaseURL "https://my-firebase-project.firebaseio.com"
            :projectId "my-firebase-project"
            :storageBucket "my-firebase-project.appspot.com"
            :messagingSenderId "YOURID"})
    (firebase/app)))
