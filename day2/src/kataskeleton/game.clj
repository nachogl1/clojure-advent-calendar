(ns kataskeleton.game
  (:gen-class))

(defn play-rock-against [opponent]
  (case opponent
    :scissors :win
    :paper :lose
    :rock :draw))

(defn play-paper-against [opponent]
  (case opponent
    :rock :win
    :scissors :lose
    :paper :draw))

(defn play-scissors-against [opponent]
  (case opponent
    :paper :win
    :rock :lose
    :scissors :draw))

(defn play-game [player opponent]
  (case player
    :rock (play-rock-against opponent)
    :paper (play-paper-against opponent)
    :scissors (play-scissors-against opponent)))