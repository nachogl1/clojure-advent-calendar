(ns part_2.input-reader-v2
  (:require [clojure.string :as str]))


(defn- read-from-file [source]
  (str/split (slurp source) #"\r\n"))

(defn- get-triplets [sourceList result]
  (let [newTriplets      (concat result (list(take 3 sourceList)) )
        newSourceList    (next (next (next sourceList)))]
    (if (not (empty? newSourceList))
      (get-triplets newSourceList newTriplets)
      newTriplets)))

(defn get-triplets-from-file [source]
  (let [sourceList (read-from-file source)]
    (get-triplets sourceList '())))