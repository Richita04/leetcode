class Solution {
    public int passThePillow(int n, int time) {

        int no_of_passes = 2 * (n - 1);
        int position = time % no_of_passes;

        int output;
        if (position < n) {
            output = position + 1;
        } else {
            output = no_of_passes - position + 1;
        }

        return output;

        
    }
}