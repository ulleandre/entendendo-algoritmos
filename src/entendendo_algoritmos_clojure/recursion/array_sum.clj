(ns entendendo-algoritmos-clojure.recursion.array-sum)

(defn execute
  [total numbers]
  (if (> (count numbers) 1)
    (execute (+ total (first numbers)) (rest numbers))
    (+ total (first numbers))))