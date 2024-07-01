class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char a1[] = s.toCharArray();
        Arrays.sort(a1);

        char a2[] = t.toCharArray();
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);

           
    }
}