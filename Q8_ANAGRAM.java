import java.util.Arrays;
import java.util.Scanner;

public class Q8_ANAGRAM {
    public static void main(String[] args) {
        String inputString="abcdeabsd";
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        String inputStringg="sfasdfasf ";
        char tempArrayy[] = inputStringg.toCharArray();
        Arrays.sort(tempArrayy);

        System.out.println(tempArray);
        System.out.println(tempArrayy);
        
        for(int i =0;i<tempArray.length;i++)
        {
            if(tempArray[i]!=tempArrayy[i])
            {
               System.out.println(" not anagram");
               break;
            }
            else
            {
                System.out.println("anagram");
            }
        }
        
        
    }
}
