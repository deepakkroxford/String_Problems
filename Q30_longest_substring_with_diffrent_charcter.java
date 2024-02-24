import java.util.HashMap;

/**
 * Q30_longest_substring_with_difrrent_charcter
 */
class substring_without_repchar {
    // brute force approach O(n^2)
    int longsub_without_rep_char(String s) {
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (sb.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                } else {
                    sb.append(s.charAt(j));
                }
            }
            if (sb.length() > maxlength) {
                maxlength = sb.length();
            }
        }
        return maxlength;
    }

    int longsub_withOn(String s) {
        HashMap<Character, Integer> Vistedmap = new HashMap<>();
        int maxlen = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            if (Vistedmap.containsKey(s.charAt(right)) && Vistedmap.get(s.charAt(right)) >= left) {
                left = Vistedmap.get(s.charAt(right)) + 1;
            }
            maxlen = Math.max(maxlen, right - left + 1);
            Vistedmap.put(s.charAt(right), right);
        }
        return maxlen;
    }
}

public class Q30_longest_substring_with_diffrent_charcter {
    public static void main(String[] args) {
        /*
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         * Example 2:
         * 
         * Input: s = "bbbbb"
         * Output: 1
         * Explanation: The answer is "b", with the length of 1.
         * Example 3:
         * 
         * Input: s = "pwwkew"
         * Output: 3
         * Explanation: The answer is "wke", with the length of 3.
         * Notice that the answer must be a substring, "pwke" is a subsequence and not a
         * substring.
         * 
         */
        substring_without_repchar ans = new substring_without_repchar();
        String s = "pwwkew";
        int maxlen = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            int currentsubstring = s.indexOf(s.charAt(right), left);

            if (currentsubstring != right) {
                left = currentsubstring + 1;
            }
            maxlen = Math.max(maxlen, right - left + 1);

        }
        /*
         * Iteration 1 (right = 0):
         * 
         * s.charAt(0) is "p".
         * s.indexOf("p", left) searches for "p" in the substring of s starting from the
         * left pointer (left = 0). It finds "p" at index 0.
         * Condition is false (0 == 0), so no adjustment is made to left.
         * maxlen is updated to 1.
         * Iteration 2 (right = 1):
         * 
         * s.charAt(1) is "w".
         * s.indexOf("w", left) searches for "w" in the substring of s starting from the
         * left pointer (left = 0). It finds "w" at index 1.
         * Condition is false (1 == 1), so no adjustment is made to left.
         * maxlen remains 1.
         * Iteration 3 (right = 2):
         * 
         * s.charAt(2) is "w".
         * s.indexOf("w", left) searches for "w" in the substring of s starting from the
         * left pointer (left = 1). It finds "w" at index 2.
         * Condition is false (2 == 2), so no adjustment is made to left.
         * maxlen is updated to 2.
         * Iteration 4 (right = 3):
         * 
         * s.charAt(3) is "k".
         * s.indexOf("k", left) searches for "k" in the substring of s starting from the
         * left pointer (left = 2). It finds "k" at index 3.
         * Condition is false (3 == 3), so no adjustment is made to left.
         * maxlen remains 2.
         * Iteration 5 (right = 4):
         * 
         * s.charAt(4) is "e".
         * s.indexOf("e", left) searches for "e" in the substring of s starting from the
         * left pointer (left = 3). It finds "e" at index 5.
         * Condition is true (-1 != 4), so adjust left to currentsubstring + 1, which is
         * 5 + 1 = 6.
         * maxlen remains 2.
         * Iteration 6 (right = 5):
         * 
         * s.charAt(5) is "w".
         * s.indexOf("w", left) searches for "w" in the substring of s starting from the
         * left pointer (left = 6). It finds "w" at index -1 (not found in the
         * substring).
         * Condition is false (-1 == 5), so no adjustment is made to left.
         * maxlen is updated to 3.
         * At the end of these iterations, maxlen is 3, representing the length of
         */
        /*
         * 0
         * 1
         * 1
         * 3
         * 4
         * 2
         */
        System.out.println(maxlen);
        System.out.println(ans.longsub_without_rep_char(s));
        System.out.println(ans.longsub_withOn(s));

    }

}