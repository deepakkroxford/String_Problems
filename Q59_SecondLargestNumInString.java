import java.util.HashSet;

public class Q59_SecondLargestNumInString {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                set.add(s.charAt(i)-'0');
            }
        }
        if(set.size()<2)
        {
            return -1;
        }

        // this is the logic to find the second largest element in the array or any thing
        int max = Integer.MIN_VALUE, secondeMax = Integer.MIN_VALUE;
        for(int num :set){
            if(num>max)
            {
                secondeMax = max;
                max = num;
            }
            else if(num>secondeMax)
            {
                secondeMax =  num;
            }
        }
        return secondeMax;
    }

    public static int secondHighestII(String s)
    {
        int max = Integer.MIN_VALUE, secondeMax = Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))){
                count++;
                int number = s.charAt(i)-'0';
                if(number>max)
                {
                    secondeMax =max;
                    max= number;
                }
                else if( number>secondeMax && number<max)
                {
                    secondeMax =number;
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return secondeMax==Integer.MIN_VALUE?-1:secondeMax;
    } 
    public static void main(String[] args) {
        /*
         Leetcode 1796 :- https://leetcode.com/problems/second-largest-digit-in-a-string/description/


         * Given an alphanumeric string s, return the second largest numerical digit
         * that appears in s, or -1 if it does not exist.
         * 
         * An alphanumeric string is a string consisting of lowercase English letters
         * and digits.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "dfa12321afd"
         * Output: 2
         * Explanation: The digits that appear in s are [1, 2, 3]. The second largest
         * digit is 2.
         * Example 2:
         * 
         * Input: s = "abc1111"
         * Output: -1
         * Explanation: The digits that appear in s are [1]. There is no second largest
         * digit.
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 500
         * s consists of only lowercase English letters and digits.
         */
        String str = "dfa12321afd";
        String str2 = "abc1111";
        Q59_SecondLargestNumInString obj = new Q59_SecondLargestNumInString();
        int ans = obj.secondHighest(str);
        int ans2 = obj.secondHighest(str2);
        System.out.println(ans);
        System.out.println(ans2);
        /*
         * Time Complexity: O(n) where n is the length of the input string
         * - We iterate through the string once to check each character
         * 
         * Space Complexity: O(1)
         * - We only use a few variables (max, secondMax) regardless of input size
         * - No extra data structures are used that grow with input
         */

         String str3 = "xyz";
         String str4 = "ck077";
         System.out.println(secondHighestII(str3));
         System.out.println(secondHighestII(str4));




         
    }
}
