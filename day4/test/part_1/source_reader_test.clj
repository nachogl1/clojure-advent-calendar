(ns part_1.source-reader-test
  (:require [part_1.source-reader :as reader]
            [clojure.test :refer :all]))

(deftest test-read-from
  (testing "file"
           (is
             (= (take 2 (reader/read-pairs-from-file "test/resources/input.txt"))
                '(["48-50" "48-49"] ["5-89" "5-5"])))))