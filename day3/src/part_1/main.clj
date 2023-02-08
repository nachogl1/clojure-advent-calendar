(ns part_1.main
  (:gen-class)
  (:require
    [part_1.common-item-manager :as scoring]
    [part_1.rucksack-manager :as rm]
    [part_1.input-reader :as ir]))


(defn get-rucksacks [source]
  (map #(rm/get-compartments-of-rucksack %) (ir/read-from-file source)))

(defn get-common-items [source]
  (map #(scoring/get-common-item-of %) (get-rucksacks source)))

(defn get-scores [source]
  (map #(scoring/score-item-priority %) (get-common-items source)))

(defn get-total-score [source]
  (reduce + (get-scores source)))