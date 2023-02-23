(ns day5.crane)

(defn- get-crate-to-move [stacks from]
  (last (nth stacks from)))

(defn- move-crate [stacks from to]
  (let [crate (get-crate-to-move stacks from)]
  (map-indexed #(cond
    (= % from) (remove #{crate} %2)
    (= % to) (conj %2 crate)
    :else %2) stacks)))

(defn move [stacks command]
  (let [from (dec (:from command))
        to (dec (:to command))
        amount (:amount command)]
    (loop [moved stacks
           processed-amount 0]
      (if (= processed-amount amount)
        moved
        (recur (move-crate moved from to) (inc processed-amount))))))

