class ExtractNumberfromString {
    static long ExtractNumber(String s) {
        long max = -1;
        String[] a = s.split(" ");

        
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i].charAt(0)) && !a[i].contains("9")) {
                max = Math.max(max, Long.valueOf(a[i]));
            }
        }
        return max;

    }
}

public class Q44_ExtractNumberfromString {
    public static void main(String[] args) {
        /*Gfg 
         https://www.geeksforgeeks.org/problems/extract-the-number-from-the-string3428/1
         * Given a sentence containing several words and numbers. Find the largest
         * number among them which does not contain 9. If no such number exists, return
         * -1.
         * 
         * Examples :
         * Input: sentence="This is alpha 5057 and 97"
         * Output: 5057
         * Explanation: 5057 is the only number that does
         * not have a 9.
         * 
         * Input: sentence="Another input 9007"
         * Output: -1
         * Explanation: Since there is no number that
         * does not contain a 9,output is -1.
         * 
         * 
         * Expected Time Complexity: O(n)
         * Expected Auxillary Space: O(n)
         * 
         * Constraints:
         * 1<=n<=106
         * 1<=answer<=1018
         * 
         */
        String s1 ="This is alpha 5057 and 97";
       long ans =  ExtractNumberfromString.ExtractNumber(s1);
       System.out.println(ans);

    }
}
