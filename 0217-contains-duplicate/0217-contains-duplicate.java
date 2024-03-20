class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        
        // Iterate through the array
        for(int i = 1; i < nums.length; i++) {
            // If adjacent elements are equal, then we found a duplicate
            if(nums[i-1] == nums[i]) {
                return true;
            }
        }
        
        // No duplicates found
        return false;
        
    }
}
