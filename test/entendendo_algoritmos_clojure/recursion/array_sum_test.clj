(ns entendendo-algoritmos-clojure.recursion.array-sum-test
  (:require [clojure.test :refer :all]
            [entendendo-algoritmos-clojure.recursion.array-sum :as recursion.array-sum]))

(deftest execute-test
  (testing "Should return 6 for the vector"
    (is (= 6 (recursion.array-sum/execute 0 [1 2 3])))))