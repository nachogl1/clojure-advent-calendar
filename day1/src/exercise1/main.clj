(ns exercise1.main
  (:gen-class)
  (:require [clojure.string :as str]
            [exercise1.core :as core]))

(defn extract-elves [input]
  (remove #(= '("") %) (partition-by str/blank? (str/split (slurp input) #"\r\n"))))

(defn extract-calories [elf]
  (map #(Integer/parseInt %) elf))

(defn find-elf-with-highest-calorie [input]
  (core/highest-calories (map extract-calories (extract-elves input))))