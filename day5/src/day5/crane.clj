(ns day5.crane)

(defn- get-moved-crate [stacks from]
  (last (nth stacks from)))

(defn- move-crate [stacks from to]
  (map-indexed #(cond
    (= % from) (drop-last %2)
    (= % to) (conj %2 (get-moved-crate stacks from))
    :else %2) stacks))

(defn move [stacks command]
  (let [from (dec (:from command))
        to (dec (:to command))
        amount (:amount command)]
    (loop [moved stacks
           processed-amount 0]
      (if (= processed-amount amount)
        moved
        (recur (move-crate moved from to) (inc processed-amount))))))

