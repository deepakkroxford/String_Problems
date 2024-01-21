public class Q13_Upper_case_conversio_ {
    public static void main(String[] args) {
        /*
         * Given a string str, convert the first letter of each word in the string to
         * uppercase.
         * 
         * Example 1:
         * 
         * Input:
         * str = "i love programming"
         * Output: "I Love Programming"
         * Explanation:
         * 'I', 'L', 'P' are the first letters of
         * the three words.
         * 
         * Your Task:
         * You dont need to read input or print anything. Complete the function
         * transform() which takes s as input parameter and returns the transformed
         * string.
         * 
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(N) to store resultant string
         * 
         * 
         */

         class Solution
{
    public String transform(String s)
    {
        // code here
        char ch[]=s.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);
        for(int i =1;i<ch.length-1;i++)
        {
            if(ch[i]==' ')
            {
                ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
        }
     return new String (ch);
      
    }
}
    }
}
