// ANAGRAM GROUPS
//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
// Easy - 9/13/2024 Big O(nlogn)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store sorted strings as keys and list of anagrams as values
        HashMap<String, List<String>> map = new HashMap<>();

        // Iterate through the array of strings
        for (int i = 0; i < strs.length; i++) {
            // Convert each string to a char array and sort it to get the "anagram signature"
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // If the sorted string is not already a key in the map, add it
            map.putIfAbsent(sorted, new ArrayList<>());

            // Add the original string to the corresponding list in the map
            map.get(sorted).add(strs[i]);
        }

        // Return the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }
}

