public class Q10_Check_if_strings_AreRotationsof_each_other_OrNot {
    public static void main(String[] args) {
        /*
         * You are given two strings of equal lengths, s1 and s2.
         * The task is to check --->
         * if s2 is a rotated version of the string s1.
         * Note: The characters in the strings are in lowercase.
         * 
         * Input:
         * s1= geeksforgeeks
         * s2= forgeeksgeeks
         * Output:
         * 1
         * Explanation: s1 is geeksforgeeks, s2 is
         * forgeeksgeeks. Clearly, s2 is a rotated
         * version of s1 as s2 can be obtained by
         * left-rotating s1 by 5 units.
         * 
         * 
         * Input:
         * s1 = mightandmagic
         * s2 = andmagicmigth
         * Output:
         * 0
         * Explanation: Here with any amount of
         * rotation s2 can't be obtained by s1.
         * 
         * 
         */
        String s1 = "geeksforgeeks";
        String s2 =  "forgeeksgeeks";

        if(s1.length()!=s2.length())
        {
            System.out.println("not rotaed version of s1");
        }

        String s3 = s1+s1;
        if(s3.contains(s2))
        {
            System.out.println("yes rorated");
        }
        else{
            System.out.println("not rotated");
        }




    }
}
