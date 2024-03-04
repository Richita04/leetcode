class Solution {
    public int[] sortedSquares(int[] nums) {

        int n= nums.length;

        int l=0;
        int r= n-1;
        int[] res= new int[n];

        for(int index=n-1; index>=0; index--){
            if(Math.abs(nums[l])>nums[r]){
                res[index]=nums[l]*nums[l];
                l++;
            }
            else{
                res[index]=nums[r]*nums[r];
                r--;
            }
        }

        for(int i=0; i<n; i++){
            nums[i]=res[i];
        }

        return res;   
    }
}