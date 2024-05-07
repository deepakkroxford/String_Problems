class max_K_LenSubstring_Conating_vowel {
    public int maxVowels(String s, int k) {
        int currentcount = 0;
        for (int i = 0; i < k; i++) {
            if (vowelcheck(s.charAt(i))) {
                currentcount++;
            }
        }

        int maxcount = currentcount;
        for (int i = k; i < s.length(); i++) {
            if (vowelcheck(s.charAt(i))) {
                currentcount++;
            }
            if (vowelcheck(s.charAt(i - k))) {
                currentcount--;
            }
            maxcount = Math.max(maxcount, currentcount);
        }

        return maxcount;

    }

    static boolean vowelcheck(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }
}

public class Q39_Count_vowel_substring {
    public static void main(String[] args) {

        /*
         * Leetcode->1456
         * Given a string s and an integer k, return the maximum number of vowel letters
         * in any substring of s with length k.
         * 
         * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "abciiidef", k = 3
         * Output: 3
         * Explanation: The substring "iii" contains 3 vowel letters.
         * Example 2:
         * 
         * Input: s = "aeiou", k = 2
         * Output: 2
         * Explanation: Any substring of length 2 contains 2 vowels.
         * Example 3:
         * 
         * Input: s = "leetcode", k = 3
         * Output: 2
         * Explanation: "lee", "eet" and "ode" contain 2 vowels.
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 105
         * s consists of lowercase English letters.
         * 1 <= k <= s.length
         * 
         */

        max_K_LenSubstring_Conating_vowel ob = new max_K_LenSubstring_Conating_vowel();
        String s = "abciiidef";
        int k = 3;
        System.out.println(ob.maxVowels(s, k));

    }
}
