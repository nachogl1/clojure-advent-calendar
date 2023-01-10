(ns part_1.main-test
  (:require [part_1.main :refer :all])
  (:use [midje.sweet]))

(fact "foo" (add-total-game-scores "test/resources/input.txt") => 10624)