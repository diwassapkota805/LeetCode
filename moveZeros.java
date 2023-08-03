class Solution {
    public void moveZeroes(int[] nums) {
        // two pointers approach

        // left pointer -> leftmost zero
        int leftPointer = 0;
        int rightPointer;
        for(rightPointer = 0; rightPointer < nums.length; rightPointer++)
        {   
            if(nums[rightPointer] != 0) // swap with the leftmost zero
            {
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = temp;

                leftPointer++; // increment the position of leftPointer
            }

        }
 // [0,1,3] -> [1,0,3] -> [1,3,0]     
    }
}

// arrays
// 283
