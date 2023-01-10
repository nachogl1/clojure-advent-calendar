(ns part_2.mapping_test
  (:require [part_2.mapping :refer :all])
  (:use [midje.sweet]))

(facts "Mapping letters to plays"
       (fact "Map a draw" (map-game ["A" "Y"]) => [:rock :rock])
       (fact "Map a lose" (map-game ["B" "X"]) => [:paper :rock])
       (fact "Map a lose" (map-game ["A" "Z"]) => [:rock :paper])
       (fact "Map a win" (map-game ["C" "Z"]) => [:scissors :rock]))
