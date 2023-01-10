(ns part_2.main-test
  (:require [part_2.main :refer :all])
  (:use [midje.sweet]))

(fact "foo" (add-total-game-scores "test/resources/input.txt") => 14060)