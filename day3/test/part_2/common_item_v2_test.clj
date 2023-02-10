(ns part_2.common-item-v2-test
  (:require [part_2.common-item-v2 :as ci])
  (:use [midje.sweet]))

(facts "get-common-items"
       (fact "In triplet" (ci/get-common-item '("ab" "ac" "ad")) => "a")
       (fact "In triplet" (ci/get-common-item '("abc" "ac" "adr")) => "a"))