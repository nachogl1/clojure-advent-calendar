(ns kataskeleton.main-test
  (:require [kataskeleton.main :refer :all])
  (:use [midje.sweet]))

(fact "foo" (add-total-game-scores "test/resources/input.txt") => 10624)