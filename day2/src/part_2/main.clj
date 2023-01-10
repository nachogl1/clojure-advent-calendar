(ns part_2.main
  (:gen-class)
  (:require [clojure.string :as str]
            [part_2.mapping :refer :all]
            [part_2.scoring :refer :all]))


(defn extract-game [game]
  (str/split game #" "))

(defn extract-games [input]
  (map extract-game (str/split (slurp input) #"\r\n")))

(defn add-total-game-scores [input]
  (reduce + (map (fn [[oppponent player ]] (score-game player oppponent)) (map map-game (extract-games input)))))