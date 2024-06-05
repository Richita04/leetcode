class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == max || num == secMax || num == thirdMax) {
                continue; // Skip duplicates
            }
            if (num > max) {
                thirdMax = secMax;
                secMax = max;
                max = num;
            } else if (num > secMax) {
                thirdMax = secMax;
                secMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        return (thirdMax != Long.MIN_VALUE) ? (int) thirdMax : (int) max;
    }
}
