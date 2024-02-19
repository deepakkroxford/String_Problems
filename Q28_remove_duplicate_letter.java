import java.util.HashSet;

public class Q28_remove_duplicate_letter {
    public static void main(String[] args) {
        HashSet <Character> map =new HashSet<>();
        String s ="cbacdcbc";
        for(int i=0;i<s.length();i++)
        {
            if(!map.contains(s.charAt(i)))
            {
                map.add(s.charAt(i));
            }
        }
        System.out.println(map.toString());
    
    }
}
