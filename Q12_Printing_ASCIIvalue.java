import java.io.StringReader;

public class Q12_Printing_ASCIIvalue {
    public static void main(String[] args) {
        String name ="amansingh";

        for(int i=0;i<name.length();i++)
        {
            int ch =name.charAt(i);
            System.out.println(""+(int)ch);
        }
    }
}
