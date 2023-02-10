(ns part_2.main
  (:require [part_2.input-reader-v2 :as reader])
  (:require [part_2.scoring :as scoring])
  (:require [part_2.common-item-v2 :as ci]))

(defn get-total-score [source]
  (reduce +
          (map #(scoring/score-item-priority %)
               (map #(ci/get-common-item %) (reader/get-triplets-from-file source)))))