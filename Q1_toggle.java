import java.util.Scanner;

public class Q1_toggle {
    public static void main(String[] args) {
        //given the string the task is toggle the all the charcater of
        // the string convert uppercase to lowercase. 
        // input :-> PhysICS
        //output :-> pHYSics
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int asci = (int)ch; //it change the charter to its integer value
            boolean flag = true;//it means that the character is large

            if((int)ch>=97)
            {
                flag = false;//it means the character is small

            }
            if(flag==true)//it means cha
            {
                asci = asci+32;
                char dh = (char)asci;
                str.setCharAt(i,dh);

            }
            else
            {
                asci = asci-32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }



        }
        System.out.println(str);




        

    }
}
