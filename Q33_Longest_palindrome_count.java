class longpalindrome_count {
    public int longestPalindrome(String s) {
        int count[] = new int[128];

        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        int res = 0;
        for (int i = 0; i < 128; i++) {
            int val = count[i];
            res = res + (val / 2) * 2;

            if (res % 2 == 0 && val % 2 == 1)

                res++;

        }

        return res;
    }
}

public class Q33_Longest_palindrome_count {
    public static void main(String[] args) {

        /* Leetcode ->409
         * Given a string s which consists of lowercase or uppercase letters, return the
         * length of the longest palindrome that can be built with those letters.
         * 
         * Letters are case sensitive, for example, "Aa" is not considered a palindrome
         * here.
         * 
         * 
         * 
         * Example 1:
         * Input: s = "abccccdd"
         * Output: 7
         * Explanation: One longest palindrome that can be built is "dccaccd", whose
         * length is 7.
         * 
         * 
         * Example 2:
         * Input: s = "a"
         * Output: 1
         * Explanation: The longest palindrome that can be built is "a", whose length is
         * 1.
         * 
         */

        longpalindrome_count ans = new longpalindrome_count();
        String s = "abccccdd";
        System.out.println(ans.longestPalindrome(s));
    }
}
