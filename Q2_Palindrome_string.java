import java.util.Scanner;

public class Q2_Palindrome_string {
    public static void main(String[] args) {
        //method 1 to check it is palindrome or not

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the string");
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // String gtr = str.reverse()+"";
        // System.out.println(gtr);

        // if(str.equals(gtr))
        // {
        //     System.out.println(" palindrome");
        // }
        // else
        // {
        //     System.out.println("not palindrome");
        // }

        //method 2 to check the string is palindrome or not
 
        //String str="abcdab";
        System.out.println("enter the string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int i=0;
        int j = str.length()-1;
        boolean flag =true;
        while (i<j) {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag=false;
            }
            i++;
            j--;
        }
        if(flag==true)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
