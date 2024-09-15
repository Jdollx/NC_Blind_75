// Top K Elements in List
//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//The test cases are generated such that the answer is always unique.
//You may return the output in any order.
// Medium - 9/15/2024
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // given array nums and int k
        // return most frequent k in array

        // initiate hashmap for int and occurence
        HashMap<Integer, Integer> map = new HashMap<>();

        // iteratre through nums and add/increment occurence
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        // sort the map to find biggest occurrences
        // Convert map entries into a list for sorting
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // initiate array to hold answer
        int[] result = new int[k];

        // find the top k frequent elements
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        // return the result array containing the k most frequent elements
        return result;
    }
}