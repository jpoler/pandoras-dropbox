(ns pandoras-dropbox.core-test
  (:require [clojure.test :refer :all]
            [pandoras-dropbox.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1)))
  (testing "test two"
    (is (= 0 2))))

(deftest test-two
  (testing "Second docstring"
    (is (empty? [1]))))

;; (deftest ^:unittest json-to-map
;;   (testing "given a json object, json-to-
