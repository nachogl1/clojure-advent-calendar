(ns part_2.mapping
  (:gen-class)
  (:require [part_2.game :refer :all]))

(def known-plays {"A" :rock "B" :paper "C" :scissors})
(def known-outcomes {"X" :lose "Y" :draw "Z" :win})
(def outcome-mappings {
                       :rock     #(play-rock-against %)
                       :paper    #(play-paper-against %)
                       :scissors #(play-scissors-against %)
                       })

(defn- map-play [play]
  (get known-plays play))

(defn map-play-for-outcome [game]
  (some (fn [[k v]] (if (= (get known-outcomes (second game)) (v (map-play (first game)))) k)) outcome-mappings))

(defn map-game [game]
  [(map-play (first game)) (map-play-for-outcome game)])
