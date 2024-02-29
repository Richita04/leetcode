class Solution {
    public void reverse(int[] arr, int x, int y){
        while (x<y){
            int temp= arr[x];
            arr[x]=arr[y];
            arr[y]= temp;

            x++;
            y--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n= nums.length;
        
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
}}