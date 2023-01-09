(ns exercise1.main-test
  (:require
    [clojure.test :as test]
    [exercise1.main :as main]))


(test/deftest return-elf-carrying-highest-caloric-total-from-test-file
  (test/testing "Find that elf"
    (test/is (= (main/find-elf-with-highest-calorie "test/resources/input1.txt") 74394))))