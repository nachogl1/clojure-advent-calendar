(ns part_1.core-test
  (:require [part_1.core :as core]
            [clojure.test :refer :all]))

(deftest acceptance
  (testing "acceptance"
           (is
            (= (core/count-number-inclusions "test/resources/input.txt") 530))))
