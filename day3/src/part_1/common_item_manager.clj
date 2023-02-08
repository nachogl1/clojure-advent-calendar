(ns part_1.common-item-manager
  (:require
    [clojure.string :as str]))


(defn- score-lowercase [input]
  (- (int (.charAt input 0)) 96))

(defn- score-uppercase [input]
  (- (int (.charAt input 0)) 38))

(defn- isUppercase? [input]
  (= (str/upper-case input) input))

(defn score-item-priority [input]
  (if (isUppercase? input)
    (score-uppercase input)
    (score-lowercase input)))

(defn get-common-item-of [[first-compartment second-compartment]]
  (apply str (distinct (filter (into #{} first-compartment) second-compartment))))
