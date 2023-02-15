(ns part_2.overlap-finder-test
  (:require [part_2.overlap-finder :as finder]
            [clojure.test :refer :all]))

(deftest finder
  (testing "find overlap"
           (is (= (finder/isAnyOverlapped? ["4-4" "3-5"]) true))
           (is (= (finder/isAnyOverlapped? ["4-6" "3-5"]) true))
           (is (= (finder/isAnyOverlapped? ["1-2" "3-5"]) false))))