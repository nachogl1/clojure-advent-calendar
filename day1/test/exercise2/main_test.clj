(ns exercise2.main-test
  (:require [clojure.test :as test]
            [exercise2.main :as main]))


(test/deftest return-three-elves-carrying-highest-caloric-total-from-test-file
  (test/testing "Find those three elves"
    (test/is (= (reduce + (main/find-three-elves-with-highest-calorie "test/resources/input2.txt")) 212836))))