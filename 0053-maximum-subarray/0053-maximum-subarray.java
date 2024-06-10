class Solution {
    public int maxSubArray(int[] nums) {
        
       // KADANE'S ALGORITHM

        int maxSum = nums[0]; // Initialize with the first element of the array
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
        
    }
}