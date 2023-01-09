(ns kataskeleton.mapping
  (:gen-class))

(def known-plays {:rock ["A" "X"] :paper ["B" "Y"] :scissors ["C" "Z"]})

(defn- play-in? [play, plays]
  (some #(= play %) plays))

(defn- map-play [play]
  (some (fn [[k v]] (if (play-in? play v) k)) known-plays))

(defn map-game [game]
  (map map-play game))
