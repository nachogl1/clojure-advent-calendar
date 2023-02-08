(ns part_1.main-test
  (:require [part_1.main :as main])
  (:use [midje.sweet]))

(facts acceptance-test
       (fact "get priority score for input" (main/get-total-score "test/resources/input.txt") => 7716))