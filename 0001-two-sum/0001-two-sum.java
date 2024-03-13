class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n= nums.length;
    
        int[] ans= new int[2];
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i=0; i<n; i++){
            int first = nums[i];
            int more= target-first;
            if(mpp.containsKey(more)){
                ans[0]=mpp.get(more);
                ans[1]=i;
                return ans;
            }
            mpp.put(nums[i],i);

        }
        return ans;
    }
}