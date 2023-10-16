(ns entendendo-algoritmos-clojure.recursion.quicksort)

(defn execute
  [values]
  (let [pivot (last values)
        remaining-values (butlast values)
        left (filter #(< % pivot) remaining-values)
        right (filter #(>= % pivot) remaining-values)]
    (flatten (concat (if (> (count left) 1) (execute left) left)
                     [pivot]
                     (if (> (count right) 1) (execute right) right)))))