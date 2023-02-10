(ns part_2.input-reader-v2-test
(:require [part_2.input-reader-v2 :as reader])
  (:use [midje.sweet]))

(facts "read triplets"
       (fact "from file" (take 2 (reader/get-triplets-from-file "test/resources/input.txt")) =>
             (list (list "ZTmtZvZLTFNLMQMNRvZncdcHwcScJvcdHnVfwV"
                 "zqjqrzqjCqrjtqWhqChqrznhcfdfVnVSVgcffcgJcSgd"
                 "rtDGpzjjqjlrGsWqBWFRsbTPFQMTbRNRFmbs")
               (list "FFlnlnVlmQqcBVhBRrSrGSwVdRJbztSt"
                 "NPPNsffWfNztRZSJNG"
                 "WpgpTTHDpgTDDpMLPGgMHslmBmmHcBQnFmcqhmnjlqQm"))))
