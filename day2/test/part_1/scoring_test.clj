(ns part_1.scoring_test
  (:require [part_1.scoring :refer :all])
  (:use [midje.sweet]))

(facts "Scoring a  game of Rock, Paper, Scissors"
       (facts "Player plays Rock"
              (let [player :rock]
                (fact "Rock winning scores 7" (score-game player :scissors) => 7)
                (fact "Rock losing scores 1" (score-game player :paper) => 1)
                (fact "Rock drawing scores 4" (score-game player :rock) => 4)))
       (facts "Player plays Paper"
              (let [player :paper]
                (fact "Paper winning scores 8" (score-game player :rock) => 8)
                (fact "Paper losing scores 2" (score-game player :scissors) => 2)
                (fact "Paper drawing scores 5" (score-game player :paper) => 5)))
       (facts "Player plays Scissors"
              (let [player :scissors]
                (fact "Scissors winning scores 9" (score-game player :paper) => 9)
                (fact "Scissors losing scores 3" (score-game player :rock) => 3)
                (fact "Scissors drawing scores 6" (score-game player :scissors) => 6))))
