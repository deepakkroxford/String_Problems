public class Q52_IsA_Subsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int ans = 0;
        int x = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(x) == t.charAt(i)) {
                ans++;
                if (x != s.length() - 1) {
                    x++;
                } else {
                    break;
                }
            }

        }
        if (ans == s.length()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        /*
         * leetcode :- 392:https://leetcode.com/problems/is-subsequence/description/?envType=study-
         * plan-v2&envId=leetcode-75
         * 
         * Given two strings s and t, return true if s is a subsequence of t, or false
         * otherwise.
         * 
         * A subsequence of a string is a new string that is formed from the original
         * string by deleting some (can be none) of the characters without disturbing
         * the relative positions of the remaining characters. (i.e., "ace" is a
         * subsequence of "abcde" while "aec" is not).
         * 
         * Example 1:
         * 
         * Input: s = "abc", t = "ahbgdc"
         * Output: true
         * Example 2:
         * 
         * Input: s = "axc", t = "ahbgdc"
         * Output: false
         * 
         * Constraints:
         * 0 <= s.length <= 100
         * 0 <= t.length <= 104
         * s and t consist only of lowercase English letters.
         * 
         * 
         * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k
         * >= 109, and you want to check one by one to see if t has its subsequence. In
         * this scenario, how would you change your code?
         */

         Q52_IsA_Subsequence obj = new Q52_IsA_Subsequence();
         System.out.println(obj.isSubsequence("abc", "ahbgdc")); // Output: true
         System.out.println(obj.isSubsequence("axc", "ahbgdc")); // Output: false
         System.out.println(obj.isSubsequence("b", "abc")); // Output: false
         System.out.println(obj.isSubsequence("", "ahbgdc")); // Output: true

    }
}
