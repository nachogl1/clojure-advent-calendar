(ns part_1.common-item-manager-test
  (:require [part_1.common-item-manager :as ci])
  (:use [midje.sweet]))

(facts common-item
       (fact "get common item" (ci/get-common-item-of '("abc" "cdf")) => "c")
       (fact "get common item" (ci/get-common-item-of '("aabbgg" "poipokipka")) => "a")
       (fact "get-score-for" (ci/score-item-priority "a") => 1)
       (fact "get-score-for" (ci/score-item-priority "z") => 26)
       (fact "get-score-for" (ci/score-item-priority "A") => 27)
       (fact "get-score-for" (ci/score-item-priority "Z") => 52))



