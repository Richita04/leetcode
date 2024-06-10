class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        int maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int count = 1;
                int prev = nums[i];
                
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] <= threshold && nums[j] % 2 != prev % 2) {
                        count++;
                        prev = nums[j];
                    } else {
                        break;
                    }
                }
                
                maxLen = Math.max(maxLen, count);
            }
        }
        
        return maxLen;
    }
}