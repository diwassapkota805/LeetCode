class Solution {
    public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{map.get(complement), i};
            }

            // If the complement does not exist, store the current number and its index in the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array or throw an exception, depending on the requirements
        return new int[]{};


    }
}
// ARRAYS
// 1
