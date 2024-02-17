class solution
{
    boolean ispalindrome(String s)
    {
        int i =0;
         int j =s.length()-1;

         while(i<j)
         {
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;

         }
         return true;
    }
}

public class Q25_Valid_Palindrome1 {
    public static void main(String[] args) {
        /*
         * A phrase is a palindrome if, after converting all uppercase letters into
         * lowercase letters and removing all non-alphanumeric characters, it reads the
         * same forward and backward. Alphanumeric characters include letters and
         * numbers.
         * 
         * Given a string s, return true if it is a palindrome, or false otherwise.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "A man, a plan, a canal: Panama"
         * Output: true
         * Explanation: "amanaplanacanalpanama" is a palindrome.
         * Example 2:
         * 
         * Input: s = "race a car"
         * Output: false
         * Explanation: "raceacar" is not a palindrome.
         * Example 3:
         * 
         * Input: s = " "
         * Output: true
         * Explanation: s is an empty string "" after removing non-alphanumeric
         * characters.
         * Since an empty string reads the same forward and backward, it is a
         * palindrome.
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 2 * 105
         * s consists only of printable ASCII characters.
         * 
         */
        solution sc  = new solution();

         String s ="A man, a plan, a canal: Panama";
         s =s.toLowerCase();
         System.out.println(sc.ispalindrome(s));

         //Another approach using the string builder
         StringBuilder ans= new StringBuilder();

         for(int i=0;i<s.length();i++)
         {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                ans.append(s.charAt(i));
            }
         }
         int start =0;
         int end = ans.length()-1;

         while (start<end) {
            if(ans.charAt(start)!=ans.charAt(end))
            {
                System.out.println("flase");
                break;
            }
            start++;
            end--;
         }


        
    }
}
