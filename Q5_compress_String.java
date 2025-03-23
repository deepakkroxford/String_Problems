
class compression {

    public String stringcomp(String s) {
        StringBuilder sc = new StringBuilder();
        int count = 1;
        sc.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sc.append(count);
                sc.append(s.charAt(i));
                count = 1;

            }

        }
        sc.append(count);
        return sc.toString();
    }

}

/**
 * Q5_compress_String
 */

public class Q5_compress_String {

    public  static int compress(char[] chars) {    
        int index =0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        /*Leetcode 443. String Compression
         *  https://leetcode.com/problems/string-compression/        
         * Given an array of characters chars, compress it using the following
         * algorithm:
         * 
         * Begin with an empty string s. For each group of consecutive repeating
         * characters in chars:
         * 
         * If the group's length is 1, append the character to s.
         * Otherwise, append the character followed by the group's length.
         * The compressed string s should not be returned separately, but instead, be
         * stored in the input character array chars. Note that group lengths that are
         * 10 or longer will be split into multiple characters in chars.
         * 
         * After you are done modifying the input array, return the new length of the
         * array.
         * 
         * You must write an algorithm that uses only constant extra space.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: chars = ["a","a","b","b","c","c","c"]
         * Output: Return 6, and the first 6 characters of the input array should be:
         * ["a","2","b","2","c","3"]
         * Explanation: The groups are "aa", "bb", and "ccc". This compresses to
         * "a2b2c3".
         * Example 2:
         * 
         * Input: chars = ["a"]
         * Output: Return 1, and the first character of the input array should be: ["a"]
         * Explanation: The only group is "a", which remains uncompressed since it's a
         * single character.
         * Example 3:
         * 
         * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
         * Output: Return 4, and the first 4 characters of the input array should be:
         * ["a","b","1","2"].
         * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to
         * "ab12".
         */

        compression c = new compression();

        String s = "aaabbbcccc";
        System.out.println(c.stringcomp(s));

        char[] value = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int ans = compress(value);
        System.out.println(ans);
        for (int i = 0; i < ans; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();


    }
}