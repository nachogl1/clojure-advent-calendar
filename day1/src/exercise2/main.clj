(ns exercise2.main
  (:gen-class)
  (:require [clojure.string :as str]
            [exercise2.core :as core]))

(defn extract-elves [input]
  (remove #(= '("") %) (partition-by str/blank? (str/split (slurp input) #"\r\n"))))

(defn extract-calories [elf]
  (map #(Integer/parseInt %) elf))

(defn find-three-elves-with-highest-calorie [input]
  (core/get-presiding-calorie-totals 3 (map extract-calories (extract-elves input))))