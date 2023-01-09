(ns exercise2.core-test
  (:require [clojure.test :as test]
            [exercise2.core :as core]))


(test/deftest finding-three-elves-carrying-the-most-calories-should
  (test/testing "Return caloric totals for the three elves carrying multiple food"
    (test/is (= (core/get-presiding-calorie-totals 3 [[1] [1 1] [1 1 1] [1 1 1 1]]) '(4 3 2)))))

