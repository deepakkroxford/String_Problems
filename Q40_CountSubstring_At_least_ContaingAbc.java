
class count_substring {
    public int countSubstringON2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (s.substring(i, j).contains("a") && s.substring(i, j).contains("b")
                        && s.substring(i, j).contains("c"))

                {
                    count++;
                }
            }
            
        }
        return count;
    }
}

public class Q40_CountSubstring_At_least_ContaingAbc {
    public static void main(String[] args) {
        /*
         * Given string s consisting only a,b,c. return the number of substrings
         * containing at least one occurrence of all these characters a, b, and c.
         * 
         * Example 1:
         * 
         * Input:
         * abcabc
         * Output:
         * 10
         * Explanation:
         * The required substrings are "abc", "abca", "abcab", "abcabc",
         * "bca", "bcab", "bcabc", "cab", "cabc" and "abc".
         * 
         * Example 2:
         * 
         * Input:
         * aaacb
         * Output:
         * 3
         * Your Task:
         * You don't have to read input or print anything. Your task is to complete the
         * function countSubstring() which takes the string s and returns the count of
         * substring having at least a,b,c.
         * 
         * Expected Time Complexity: O(n)
         * Expected Space Complexity: O(1)
         */
        count_substring ans = new count_substring();
        String s = "abcabc";
        System.out.println(ans.countSubstringON2(s));

    }
}
