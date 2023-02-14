(ns part_1.core
  (:require [part_1.source-reader :as reader]
            [part_1.enclosed-range-finder :as finder]))


(defn count-number-inclusions [source]
  (count (filter #(finder/isAnyEnclosed? %) (reader/read-pairs-from-file source))))