(ns part_2.core
  (:require [part_1.source-reader :as reader]
            [part_2.overlap-finder :as finder]))


(defn count-number-inclusions [source]
  (count (filter #(finder/isAnyOverlapped? %) (reader/read-pairs-from-file source))))