(ns entendendo-algoritmos-clojure.recursion.quicksort-test
  (:require [clojure.test :refer :all]
            [entendendo-algoritmos-clojure.recursion.quicksort :as recursion.quicksort]))

(deftest execute-test
  (testing "Should return [2 3 4 5 5 9] for the vector"
    (is (= [2 3 4 5 5 9] (recursion.quicksort/execute [3 4 5 2 5 9]))))

  (testing "Should return [2 2 2 2] for the vector"
    (is (= [2 2 2 2] (recursion.quicksort/execute [2 2 2 2]))))

  (testing "Should return [2 2 2 3] for the vector"
    (is (= [2 2 2 3] (recursion.quicksort/execute [2 3 2 2])))))
