class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n= nums.length;
        HashMap<Integer,Integer> mpp= new HashMap<>();

        for(int i=0; i<n; i++){
            if(mpp.containsKey(nums[i])){
                return true;
            }
            mpp.put(nums[i],i);
        }
        return false;
        
    }
}
