package SlidingWindowProblem;

public class PrintingSubstring {
    public static void main(String[] args) {

        /*
         * this how we can find the substring of the given string
         */
        String s  = "aman";

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
/*
 * hii how are u
 */
