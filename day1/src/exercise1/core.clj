(ns exercise1.core
  (:gen-class))

(defn sum-calories [elf]
  (reduce + elf))

(defn highest-calories [elves]
  (apply max (flatten (map sum-calories elves))))