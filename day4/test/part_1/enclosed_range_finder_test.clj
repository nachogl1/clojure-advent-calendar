(ns part_1.enclosed-range-finder-test
  (:require [part_1.enclosed-range-finder :as finder]
            [clojure.test :refer :all]))

(deftest enclosed-range
  (testing "range"
           (is (= (finder/isAnyEnclosed? ["2-3" "1-4"]) true))
           (is (= (finder/isAnyEnclosed? ["2-4" "1-4"]) true))
           (is (= (finder/isAnyEnclosed? ["6-6" "4-6"]) true))
           (is (= (finder/isAnyEnclosed? ["1-4" "1-4"]) true))
           (is (= (finder/isAnyEnclosed? ["2-5" "1-4"]) false))
           (is (= (finder/isAnyEnclosed? ["1-4" "2-3"]) true))
           (is (= (finder/isAnyEnclosed? ["1-4" "2-4"]) true))
           (is (= (finder/isAnyEnclosed? ["1-4" "2-6"]) false))))