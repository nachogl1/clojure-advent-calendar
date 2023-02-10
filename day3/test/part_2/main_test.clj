(ns part_2.main-test
  (:use [midje.sweet])
  (:require [part_2.main :as main]))

(facts acceptance-test
       (fact "get priority score for input"
             (main/get-total-score "test/resources/input.txt") => 2973))