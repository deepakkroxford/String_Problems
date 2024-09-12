import java.util.ArrayList;

public class Q35_SearchPattern_Rabin_KarpAlgorithm {
    public static void main(String[] args) {
        /*
         * Given two strings, one is a text string and other is a pattern string. The
         * task is to print the indexes of all the occurences of pattern string in the
         * text string. For printing, Starting Index of a string should be taken as 1.
         * The strings will only contain lowercase English alphabets ('a' to 'z').
         * 
         * Example 1:
         * Input:
         * text = "birthdayboy"
         * pattern = "birth"
         * Output:
         * [1]
         * Explanation:
         * The string "birth" occurs at index 1 in text.
         * 
         * 
         * Example 2:
         * Input:
         * text = "geeksforgeeks"
         * pattern = "geek"
         * Output:
         * [1, 9]
         * Explanation:
         * The string "geek" occurs twice in text, one starts are index 1 and the other
         * at index 9.
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function search() which takes the string text and the string pattern as input
         * and returns an array denoting the start indices (1-based) of substring
         * pattern in the string text.
         * 
         * Expected Time Complexity: O(|text| + |pattern|).
         * Expected Auxiliary Space: O(1).
         * 
         */
         ArrayList<Integer> a=new ArrayList<Integer>();
         String  text = "geeksforgeeks";
         String pattern ="geek";

         int m=pattern.length();
        int n=text.length();
         for(int i =0;i<=n-m;i++)
         {
            String s1=text.substring(i,i+m);

            if(s1.equals(pattern))
            {
                a.add(i+1);

            }
         }

         System.out.println(a);

    }
}
