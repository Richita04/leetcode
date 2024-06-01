class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int n = s.length();
        int m = t.length();
        
        for (int j=0; j<m && i<n; j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i==n;
    
    }
}