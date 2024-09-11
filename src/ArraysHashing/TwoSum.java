// TWO SUM INTEGERS
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//Return the answer with the smaller index first.
// Easy - 9/11/2024

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // given array nums and int target
        // return indices of i and j nums[i] + nums[j] == target and i != j
        // iterate through the array and either use two pointers, hashmap,
        // or two for loops
        // hashmap Big O(N) for iterating and adding to map

        // initiate map to store previous nums and difference of nums and target
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterate through the nums array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(diff)) {
                // If the difference (diff) is already in the map, it means we have previously encountered
                // a number that, when added to the current number nums[i], equals the target.

                // Return an array with two indices:
                // - map.get(diff): the index of the previously encountered number (stored in the map)
                // - i: the current index, which is the index of the current number nums[i]
                return new int[] { map.get(diff), i };
            }
            // store the number and its index
            map.put(num, i);
        }

        return new int[] {};
    }
}

