(ns part_1.input-reader-test
  (:require [part_1.input-reader :as reader])
  (:use [midje.sweet]))

(facts "read"
       (fact "from file" (take 2 (reader/read-from-file "test/resources/input.txt")) =>
             '("ZTmtZvZLTFNLMQMNRvZncdcHwcScJvcdHnVfwV" "zqjqrzqjCqrjtqWhqChqrznhcfdfVnVSVgcffcgJcSgd")))
