import java.util.Arrays;
class Solution {
    public int strStr(String haystack, String needle) {
        char[] s1 = haystack.toCharArray();
        char[] s2 = needle.toCharArray();
        for (int i = 0; i <= s1.length - s2.length; i++) {
            boolean match = true;
            for (int j = 0; j < s2.length; j++) {
                if (s1[i + j] != s2[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;  // return index if full match found
            }
        }

        return -1; // if no match found
    }
}
