public class Q51_Greatest_CommonDivisor {

    public String divisior(String str1, String str2) {

        /*
         * Base case : if the both string are equal then we return the sting itself .
         * we can return any string like str1 and str2
         * for checking the string is equal we can use the equals to method
         * 
         */
        if (str2.equals(str1)) {
            return str1;
        }

        /*
         * Assumotion : i assume the length of the str2 is less than the length of the
         * str1
         * If the length of the str2 greater than the length of the str1 then we have to
         * swap the
         * str2 with str1.
         */

        if (str2.length() > str1.length()) {
            return divisior(str2, str1);
        }

        /*
         * Now we have to check if the str2 starts with str1 if yes then we have to divide other wise 
         * we have to return the empty string
         */

        if(str1.startsWith(str2))
        {
            return divisior(str1.substring(str2.length()), str2);
        }
        return "";

    }

    public static void main(String[] args) {
        /*
         * Leetcode :-1071
         * https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/
         * 1463024128/?envType=study-plan-v2&envId=leetcode-75
         * For two strings s and t, we say "t divides s" if and only if s = t + t + t +
         * ... + t + t (i.e., t is concatenated with itself one or more times).
         * 
         * Given two strings str1 and str2, return the largest string x such that x
         * divides both str1 and str2.
         * 
         * Example 1:
         * 
         * Input: str1 = "ABCABC", str2 = "ABC"
         * Output: "ABC"
         * Example 2:
         * 
         * Input: str1 = "ABABAB", str2 = "ABAB"
         * Output: "AB"
         * Example 3:
         * 
         * Input: str1 = "LEET", str2 = "CODE"
         * Output: ""
         * 
         * 
         * Constraints:
         * 
         * 1 <= str1.length, str2.length <= 1000
         * str1 and str2 consist of English uppercase letters.
         */

         Q51_Greatest_CommonDivisor obj = new Q51_Greatest_CommonDivisor();
         System.out.println(obj.divisior("ABCABC", "ABC")); // "ABC"
         System.out.println(obj.divisior("ABABAB", "ABAB")); // "AB"
         System.out.println(obj.divisior("LEET", "CODE")); // ""
         



    }
}
