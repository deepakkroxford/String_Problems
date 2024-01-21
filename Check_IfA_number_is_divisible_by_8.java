public class Check_IfA_number_is_divisible_by_8 {
    public static void main(String[] args) {
        /*
         * Given a number S, check if it is divisible by 8.
         * 
         * Example 1:
         * 
         * Input:
         * S=16
         * Output:
         * 1
         * Explanation:
         * The given number is divisible by 8.
         * Example 2:
         * 
         * Input:
         * S=54141111648421214584416464555
         * Output:
         * -1
         * Explanation:
         * Given Number is not divisible by 8.
         */

         class Solution{
            int DivisibleByEight(String S){
                //code here
                 int rem=0;
                 for(int i =0;i<S.length();i++)
                 {
                     int digit=Character.getNumericValue(S.charAt(i));
                     rem = (rem*10+digit)%8;
                     
                 }
                 if(rem==0)
                 {
                     return 1;
                 }
                 return -1;
            }
        }
    }
}
