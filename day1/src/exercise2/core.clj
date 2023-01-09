(ns exercise2.core
  (:gen-class))

(defn sum-calories [elf]
  (reduce + elf))

(defn get-presiding [count, elves]
  (seq (take count (sort > elves))))

(defn get-presiding-calorie-totals [count, elves]
  (get-presiding count (flatten (map sum-calories elves))))