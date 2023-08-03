class Solution {
    public void rotate(int[] nums, int k) {
        // to handle case where k>nums.length
        k = k%nums.length;

        // reverse the entire array
        // [1,2,3,4,5] -> [5,4,3,2,1]
        reverse(nums, 0, nums.length-1);

        // then reverse the array from index 0 to k-1 th element 
        // assuming [k = 2] [5,4,3,2,1] -> [4,5,3,2,1]
        reverse(nums, 0, k-1);

        //then reverse the rest of the array
        // [4,5,3,2,1] -> [4,5,1,2,3]
        reverse(nums, k, nums.length-1);
    }
    // create a reverse function
    public void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}

// array
// 189
