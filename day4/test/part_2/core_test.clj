(ns part_2.core-test
  (:require [part_2.core :as core]
            [clojure.test :refer :all]))

(deftest acceptance
  (testing "acceptance"
           (is
            (= (core/count-number-inclusions "test/resources/input.txt") 903))))
