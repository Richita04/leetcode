class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;

        int count_red=0;
        int count_white=0;
        int count_blue=0;

        for(int i=0; i<n; i++){
            if (nums[i]==0){
                count_red++;
            } 
            else if (nums[i]==1){
                count_white++;
            }
            else{
                count_blue++;
            }
        }

        int index=0;

        while(count_red>0){
            nums[index++]=0;
            count_red--;
        }

        while(count_white>0){
            nums[index++]=1;
            count_white--;
        }

        while(count_blue>0){
            nums[index++]=2;
            count_blue--;
        }
        
}
}