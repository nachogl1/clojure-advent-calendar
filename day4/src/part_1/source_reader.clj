(ns part_1.source-reader
  (:require [clojure.string :as str]))

(defn- read-from-file [source]
  (str/split (slurp source) #"\r\n"))

(defn read-pairs-from-file [source]
  (map #(str/split % #",") (read-from-file source)))