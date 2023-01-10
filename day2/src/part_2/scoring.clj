(ns part_2.scoring
  (:gen-class)
  (:require [part_2.game :refer :all]))

(defn score-play [outcome]
  (case outcome
    :win 6
    :draw 3
    :lose 0))

(defn tally-score [play-score play-result]
  (+ play-score (score-play play-result)))

(defn score-game [player opponent]
  (case player
    :rock (tally-score 1 (play-game player opponent))
    :paper (tally-score 2 (play-game player opponent))
    :scissors (tally-score 3 (play-game player opponent))))
