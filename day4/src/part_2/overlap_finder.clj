(ns part_2.overlap-finder
  (:require [clojure.string :as str]))

(defn- getFirstNumber [pair]
  (Integer/parseInt (first (str/split pair #"-"))))

(defn- getSecondNumber [pair]
  (Integer/parseInt (second (str/split pair #"-"))))

(defn- makeRangeOf [pair]
  (range (getFirstNumber pair) (inc (getSecondNumber pair))))

(defn- getExtremes [pair]
  (list (getFirstNumber pair) (getSecondNumber pair)))

(defn- overlapped? [pair1 pair2]
  (some #(.contains (makeRangeOf pair2) %) (getExtremes pair1)))

(defn isAnyOverlapped? [[pair1 pair2]]
  (boolean (or (overlapped? pair1 pair2) (overlapped? pair2 pair1))))