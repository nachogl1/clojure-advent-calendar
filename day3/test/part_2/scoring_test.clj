(ns part_2.scoring-test
  (:use [midje.sweet])
  (:require [part_2.scoring :as scoring]))

(facts "Scoring triplets"
       (fact "get-score-for" (scoring/score-item-priority "a") => 1)
       (fact "get-score-for" (scoring/score-item-priority "z") => 26)
       (fact "get-score-for" (scoring/score-item-priority "A") => 27)
       (fact "get-score-for" (scoring/score-item-priority "Z") => 52))