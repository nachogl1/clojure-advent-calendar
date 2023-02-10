(ns part_2.scoring
  (:require
    [clojure.string :as str]))

(defn- score-lowercase [item]
  (- (int (.charAt item 0)) 96))

(defn- score-uppercase [item]
  (- (int (.charAt item 0)) 38))

(defn- isUppercase? [item]
  (= (str/upper-case item) item))

(defn score-item-priority [item]
  (if (isUppercase? item)
    (score-uppercase item)
    (score-lowercase item)))