class Solution {
    public int majorityElement(int[] nums) {

        int n= nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){

            //Get the value of current element in the array
            int value= mpp.getOrDefault(nums[i],0);

            //Increment the count of occurrances
            mpp.put(nums[i], value+1);

        }

        for(Map.Entry<Integer,Integer> ans: mpp.entrySet()){
            if (ans.getValue() > (n/2)){
                return ans.getKey();
            }
        }
        return -1;  
    }
}