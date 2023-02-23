(ns day5.crane)

(defn- peek [stack]
  (take-last 1 stack))

(defn- push [stack crate]
  (flatten (conj crate stack)))

(defn- remove-top [stack]
  (flatten (drop-last stack)))

(defn- move-crate [stacks from to]
  (map-indexed #(cond
    (= % from) (remove-top %2)
    (= % to) (push %2 (peek (nth stacks from)))
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

