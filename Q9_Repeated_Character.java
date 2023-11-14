/**
 * Q9_Repeated_Character
 */
public class Q9_Repeated_Character {

    public static void main(String[] args) {
        /*
         * Given a string consisting of lowercase english alphabets.
         * Find the repeated character present first in the string.
         * 
         * Input:
         * S = "geeksforgeeks"
         * Output: g
         * Explanation: g, e, k and s are the repeating
         * characters. Out of these, g occurs first.
         * 
         * Input:
         * S = "abcde"
         * Output: -1
         * Explanation: No repeating character present.
         */

        String s = "geeksforgeeks";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println(s.charAt(i));  
                break; 
               /*
               when we get our first charcter that count is equal or greater than 2 then 
               it return the first that character. here insted of using return we use break...

                */ 
            }
        }

    }
}