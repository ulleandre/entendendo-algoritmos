(ns entendendo-algoritmos-clojure.recursion.quicksort)

(defn execute
  [values]
  (let [pivot (last values)
        rest-values (butlast values)
        left (filter #(< % pivot) rest-values)
        right (filter #(>= % pivot) rest-values)]
    (flatten (concat (if (> (count left) 1) (execute left) left)
                     [pivot]
                     (if (> (count right) 1) (execute right) right)))))