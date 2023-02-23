(ns day5.crane)

(defn- get-stack [stacks from]
  (nth stacks from))

(defn- peek-stack [stack]
  (take-last 1 stack))

(defn- push-stack [stack crate]
  (flatten (conj crate stack)))

(defn- pop-stack [stack]
  (flatten (drop-last stack)))

(defn- move-crate [stacks from to]
  (map-indexed #(cond
    (= % from) (pop-stack %2)
    (= % to) (push-stack %2 (peek-stack (get-stack stacks from)))
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

