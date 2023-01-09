(ns kataskeleton.game-test
  (:require [kataskeleton.game :refer :all])
  (:use [midje.sweet]))

(facts "Playing a  game of Rock, Paper, Scissors"
       (facts "Player plays Rock"
              (let [player :rock]
                (fact "Rock beats scissors" (play-game player :scissors) => :win)
                (fact "Rock loses against paper" (play-game player :paper) => :lose)
                (fact "Rock draws against itself" (play-game player :rock) => :draw)))
       (facts "Player plays Paper"
              (let [player :paper]
                (fact "Paper beats rock" (play-game player :rock) => :win)
                (fact "Paper loses against scissors" (play-game player :scissors) => :lose)
                (fact "Paper draws against itself" (play-game player :paper) => :draw)))
       (facts "Player plays Scissors"
              (let [player :scissors]
                (fact "Scissors beats paper" (play-game player :paper) => :win)
                (fact "Scissors loses against rock" (play-game player :rock) => :lose)
                (fact "Scissors draws against itself" (play-game player :scissors) => :draw))))




