import java.util.Scanner;
public class Buldier_Buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("amansingh");
        /*
         * when we create the string buffer so the default size of the buffer is
         * 16
         */
        str.append("rathore");
        str.setCharAt(0, 'k');//using this method we can change the index character
        str.insert(2, "200");//using this method we can insert the string,charcter at that given index
        str.reverse();
        
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.length());
      
        try (// How to take input from user in the string builder and string buffer
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the stringbulider");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            System.out.println(sb);

            System.out.println("enter the string buffer");
            StringBuffer sr = new StringBuffer(sc.nextLine());
            System.out.println(sr);
        }




    }
}
