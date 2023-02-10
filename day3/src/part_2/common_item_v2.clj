(ns part_2.common-item-v2)

(defn- get-common-item-of [first-compartment second-compartment]
  (apply str (distinct (filter (into #{} first-compartment) second-compartment))))

(defn get-common-item [[bag1 bag2 bag3]]
  (apply str (get-common-item-of (get-common-item-of bag1 bag2) bag3)))

