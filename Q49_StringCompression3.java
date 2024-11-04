import java.util.Stack;

class StringCompression {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        // the count should be initialy 1 for the any character
        int count = 1;

        // my approach is first i add the charcter in the stack from back side and then
        // try i start counting if the count reachech to 9 for any particular character
        // so i will append first the count and then the current character and reset the
        // count and then so on .

        for (int i = word.length() - 1; i >= 0; i--) {
            st.push(word.charAt(i));
        }

        while (!st.isEmpty()) {
            char c = st.pop();

            while (!st.isEmpty() && st.peek() == c && count < 9) {
                count++;
                st.pop();

            }
            sb.append(count);
            sb.append(c);
            count = 1;
        }

        return sb.toString();

    }
}

public class Q49_StringCompression3 {
    public static void main(String[] args) {
        /*
         * Leetcode -> 3163
         * https://leetcode.com/problems/string-compression-iii/description/?envType=
         * daily-question&envId=2024-11-04
         * Given a string word, compress it using the following algorithm:
         * 
         * Begin with an empty string comp. While word is not empty, use the following
         * operation:
         * Remove a maximum length prefix of word made of a single character c repeating
         * at most 9 times.
         * Append the length of the prefix followed by c to comp.
         * Return the string comp.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: word = "abcde"
         * 
         * Output: "1a1b1c1d1e"
         * 
         * Explanation:
         * 
         * Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c",
         * "d", and "e" as the prefix in each operation.
         * 
         * For each prefix, append "1" followed by the character to comp.
         * 
         * Example 2:
         * 
         * Input: word = "aaaaaaaaaaaaaabb"
         * 
         * Output: "9a5a2b"
         * 
         * Explanation:
         * 
         * Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa",
         * "aaaaa", and "bb" as the prefix in each operation.
         * 
         * For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
         * For prefix "aaaaa", append "5" followed by "a" to comp.
         * For prefix "bb", append "2" followed by "b" to comp.
         * 
         * 
         * Constraints:
         * 
         * 1 <= word.length <= 2 * 105
         * word consists only of lowercase English letters.
         */

         StringCompression sc = new StringCompression();
         String word1 = "abcde";
         System.out.println(sc.compressedString(word1)); // 1a1b1c1d1e

         String word2 = "aaaaaaaaabccccddddd";
         System.out.println(sc.compressedString(word2));
    }
}
