(ns part_1.rucksack-manager)

(defn- get-half-of [input]
  (/ (count input) 2))

(defn- first-compartment [input]
  (apply str (take (get-half-of input) input)))

(defn- second-compartment [input]
  (apply str (subs input (get-half-of input) )))

(defn get-compartments-of-rucksack [input]
  (list (first-compartment input) (second-compartment input)))