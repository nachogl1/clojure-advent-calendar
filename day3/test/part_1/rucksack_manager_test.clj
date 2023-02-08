(ns part_1.rucksack-manager-test
  (:require [part_1.rucksack-manager :as rm])
  (:use [midje.sweet]))

(facts process-rucksack
       (fact "get compartments from string"
             (rm/get-compartments-of-rucksack "ZTmtZvZLTFNLMQMNRvZncdcHwcScJvcdHnVfwV") =>
             '("ZTmtZvZLTFNLMQMNRvZ" "ncdcHwcScJvcdHnVfwV")))