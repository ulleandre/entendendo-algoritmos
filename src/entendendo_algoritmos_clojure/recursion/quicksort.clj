(ns entendendo-algoritmos-clojure.recursion.quicksort)

(defn execute
  [values]
  (let [pivot (some-> values last)
        rest-values (or (some-> values butlast) [])
        left (or (some->> rest-values (filter #(< % pivot))) [])
        right (or (some->> rest-values (filter #(>= % pivot))) [])]
    (flatten (concat [(if (> (count left) 1) (execute left) left)]
                     [pivot]
                     [(if (> (count right) 1) (execute right) right)]))))