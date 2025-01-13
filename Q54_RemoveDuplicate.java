
import java.util.LinkedHashSet;


public class Q54_RemoveDuplicate {
    public static void main(String[] args) {
        String s = "Hii hello how Hii how are are you";
        LinkedHashSet<String > set = new LinkedHashSet<String>();
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            if(!set.contains(words[i])){
            set.add(words[i]);
            sb.append(words[i]).append(" ");
            }
        }
        String ans = sb.toString();
        System.out.println(ans);
    
        // output shoud be in order
        //Hii hello how  are  you
    }
}
