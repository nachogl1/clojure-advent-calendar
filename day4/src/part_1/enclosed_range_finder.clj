(ns part_1.enclosed-range-finder
  (:require [clojure.string :as str]))


(defn- getFirstNumber [pair]
  (Integer/parseInt (first (str/split pair #"-"))))

(defn- getSecondNumber [pair]
  (Integer/parseInt (second (str/split pair #"-"))))

(defn- makeRangeOf [pair]
  (range (getFirstNumber pair) (inc (getSecondNumber pair))))

(defn- getExtremes [pair]
  (list (getFirstNumber pair) (getSecondNumber pair)))

(defn- isEnclosed? [pair1 pair2]
  (every? #(.contains (makeRangeOf pair2) %) (getExtremes pair1)))

(defn isAnyEnclosed? [[pair1 pair2]]
  (or (isEnclosed? pair1 pair2) (isEnclosed? pair2 pair1)))


