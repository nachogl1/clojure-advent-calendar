(ns day5.crane-spec
  (:require [speclj.core :refer :all]
            [day5.crane :refer :all]))

(describe "crane"
  (describe "moves 1 crate"
    (it "from 1 to 2"
      (let [crates [['M'] []]
            command {:amount 1 :from 1 :to 2}]
      (should= [[] ['M']] (move crates command))))
    (it "from 2 to 1"
      (let [crates [[] ['M']]
            command {:amount 1 :from 2 :to 1}]
      (should= [['M'] []] (move crates command))))
    (it "from 1 to 3"
        (let [crates [['M'] [] []]
              command {:amount 1 :from 1 :to 3}]
          (should= [[] [] ['M']] (move crates command))))
    (it "from 2 to 3"
        (let [crates [[] ['M'] []]
              command {:amount 1 :from 2 :to 3}]
          (should= [[] [] ['M']] (move crates command))))
    (it "from 3 to 1"
        (let [crates [[] [] ['M']]
              command {:amount 1 :from 3 :to 1}]
          (should= [['M'] [] []] (move crates command)))))
  (describe "moves multiple crates one at a time"
    (it "moves 3 from 1 to 3"
        (let [crates [['Z' 'N' 'D'] ['M' 'C'] ['P']]
              command {:amount 3 :from 1 :to 3}]
          (should= [[] ['M' 'C'] ['P' 'D' 'N' 'Z']] (move crates command))))))