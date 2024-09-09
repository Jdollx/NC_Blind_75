// DUPLICATE INTEGER
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
// Easy - 9/9/2024

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // use two for loops to compare against each other
        // Big O(2N)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] == nums[j]) {
                    return true;
                }
        }
        return false;
    }
}
