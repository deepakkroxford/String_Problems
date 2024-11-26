class Valid_Word {
    public boolean isvowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                continue;
            } else if (isvowel(word.charAt(i))) {
                vcount++;
            } else if (Character.isLetter(i)) {
                ccount++;
            } else {
                return false;
            }
        }
        if (vcount > 0 && ccount > 0) {
            return true;
        }
        return false;

        /*
         * else if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
         * ASCII values for a-z and A-Z
         * ccount++;
         */
    }
}

public class Q43_Valid_Word {
    public static void main(String[] args) {
        /*
         * Leetcode - 3136
         * A word is considered valid if:
         * 
         * It contains a minimum of 3 characters.
         * It contains only digits (0-9), and English letters (uppercase and lowercase).
         * It includes at least one vowel.
         * It includes at least one consonant.
         * You are given a string word.
         * 
         * Return true if word is valid, otherwise, return false.
         * 
         * Notes:
         * 
         * 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
         * A consonant is an English letter that is not a vowel.
         * 
         * 
         * Example 1:
         * 
         * Input: word = "234Adas"
         * 
         * Output: true
         * 
         * Explanation:
         * 
         * This word satisfies the conditions.
         * 
         * Example 2:
         * 
         * Input: word = "b3"
         * 
         * Output: false
         * 
         * Explanation:
         * 
         * The length of this word is fewer than 3, and does not have a vowel.
         * 
         * Example 3:
         * 
         * Input: word = "a3$e"
         * 
         * Output: false
         * 
         * Explanation:
         * 
         * This word contains a '$' character and does not have a consonant.
         * 
         * 
         * 
         * Constraints:
         * 
         * 1 <= word.length <= 20
         * word consists of English uppercase and lowercase letters, digits, '@', '#',
         * and '$'.
         */

        Valid_Word ans = new Valid_Word();
        String s = "a3ae";
        System.out.println(ans.isValid(s));
    }
}
