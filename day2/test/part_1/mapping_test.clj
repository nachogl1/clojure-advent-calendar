(ns part_1.mapping_test
  (:require [part_1.mapping :refer :all])
  (:use [midje.sweet]))

(facts "Mapping letters to plays"
       (fact "Map a game" (map-game ["A" "Y"]) => [:rock :paper])
       (fact "Map another game" (map-game ["B" "X"]) => [:paper :rock])
       (fact "Map another game" (map-game ["C" "Z"]) => [:scissors :scissors]))
