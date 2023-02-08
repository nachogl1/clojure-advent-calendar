(ns part_1.input-reader
  (:require [clojure.string :as str]))

(defn read-from-file [source]
  (str/split (slurp source)  #"\r\n"))