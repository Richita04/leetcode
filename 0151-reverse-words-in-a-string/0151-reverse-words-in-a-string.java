class Solution {
    public static void reverse(char[] a, int low, int high){

        while(low<=high){
            char temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            
            low++;
            high--;
        }
    }

    public String reverseWords(String s) {

        char[] a = s.trim().toCharArray();
        int n = a.length;

        reverse(a, 0, n - 1);

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (a[end] == ' ') {
                reverse(a, start, end - 1);
                start = end + 1;
            }
        }
        reverse(a, start, n - 1);

        return String.join(" ", new String(a).split("\\s+"));

    }
}