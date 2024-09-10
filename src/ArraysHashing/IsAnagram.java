// IS ANAGRAM
// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
// Easy - 9/9/2024

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // need to compare words against each other
        // can either use hashmap or sorted and pointers
        // use hashmap to add each letter and its occurrence
        // Big O(n) to access hashmap and for n+n loops

        // if not same length, then not anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // initiate hashmap
        HashMap<Character, Integer> letters = new HashMap<>();

        // iterate through s words
        // put in hashmap or update
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            letters.put(ch, letters.getOrDefault(ch, 0) + 1);
        }

        // iterate through t word and check if in hashmap
        // if in hashmap, decrease by 1
        for (int j = 0; j < t.length(); j++) {
            char chj = t.charAt(j);
            if (letters.containsKey(chj)) {
                letters.put(chj, letters.get(chj) - 1);
                // removes the letter from hashmap once 0
                if (letters.get(chj) == 0) {
                    letters.remove(chj);
                }
                // returns false if negative/unused letters
            } else {
                return false;
            }
        }
        // makes sure that hashmap is empty and returns true/false
        return letters.isEmpty();
    }
}
