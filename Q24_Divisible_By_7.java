import java.util.Scanner;

public class Q24_Divisible_By_7 {
    public static void main(String[] args) {
        /*
         * Given an n-digit large number in form of string, check whether it is
         * divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.
         * 
         * Input: num = "8955795758"
         * Output: 1
         * Explanation: 8955795758 is divisible
         * by 7.
         * 
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String num = sc.nextLine();

        int rem = 0;
        for(int i=0;i<num.length();i++)
        {
            int digit =Character.getNumericValue(num.charAt(i));
            rem = (rem*10+digit)%7;
        }

        if(rem==0)
        {
            System.err.println("it is divisible");
        }
        else
        {
            System.out.println("not divisible");
        }

    }
}
