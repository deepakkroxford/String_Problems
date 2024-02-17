/**
 * Q15_reverseWord
 */
public class Q15_reverseWord {

    public static void main(String[] args) {

        /*
        leetcode=151
         * Given an input string s, reverse the order of the words.
         * 
         * A word is defined as a sequence of non-space characters. The words in s will
         * be separated by at least one space.
         * 
         * Return a string of the words in reverse order concatenated by a single space.
         * 
         * Note that s may contain leading or trailing spaces or multiple spaces between
         * two words. The returned string should only have a single space separating the
         * words. Do not include any extra spaces.
         * 
         * 
         * 
         * Example 1:
         * Input: s = "the sky is blue"
         * Output: "blue is sky the"
         * 
         * Example 2:
         * Input: s = "  hello world  "
         * Output: "world hello"
         * Explanation: Your reversed string should not contain leading or trailing
         * spaces.
         *
         * Example 3:
         * Input: s = "a good   example"
         * Output: "example good a"
         * Explanation: You need to reduce multiple spaces between two words to a single
         * space in the reversed string.
         * 
         */
       
         //approach without using any method 

        //  String s = "  hello world  ";
        //  String ans ="";
        //  int i =s.length()-1;

        //  while(i>=0)
        //  {
        //     while (i>=0 &&s.charAt(i)==' ') {
        //         i--;
        //     }
        //     int j=i;

        //     if(i<0) break;
        //     while (i>=0 && s.charAt(i)!=' ') {
        //         i--;
        //     }
        //     if(ans.isEmpty())
        //     {
        //         ans = ans.concat(s.substring(i+1, j+1));
        //     }
        //     else{
        //         ans = ans.concat(" "+s.substring(i+1, j+1));
        //     }
        //  }
        //  System.out.println(ans);

         //using method

         String s1 ="a good   example";
         String arr[] = s1.split(" +");
         for(int y=0;y<arr.length;y++)
         {
            System.out.println(arr[y]);
         }
         StringBuilder ans1 =new StringBuilder();
        for(int x=arr.length-1;x>=0;x--)
        {
            ans1.append(arr[x]);
            ans1.append(" ");
            
        }

        System.out.println(ans1.toString().trim());
         

    }
}