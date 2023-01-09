(ns exercise1.core-test
  (:require
    [clojure.test :as test]
            [exercise1.core :as core]))


(test/deftest finding-elf-carrying-the-most-calories-should
  (test/testing "Return caloric total for one elf carrying one food"
    (test/is (= 10000 (core/highest-calories [[10000]])))
    (test/testing "Return caloric total for one elf carrying multiple food"
      (test/is (= 10010 (core/highest-calories [[10000 5 5]]))))
    (test/testing "Find the highest caloric total in elves carrying one food"
      (test/is (= 10 (core/highest-calories [[1] [2] [10]]))))
    (test/testing "Find the highest caloric total in elves carrying multiple food"
      (test/is (= 300 (core/highest-calories [[1 2 3] [2 12 34] [100 100 100]]))))))

