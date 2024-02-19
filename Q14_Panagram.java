import java.util.HashSet;

class boss{  // this is class 
    public static boolean Panagram(String s) // this is method
    {
       HashSet<Character> set = new HashSet<>();
       String ans = s.toLowerCase();
        if(s.length()<26)
        {
           return false;
        }
   
        for(int i =0;i<s.length();i++)
        {
            set.add(ans.charAt(i));
        }
        String temp="abcdefghijklmnopqrstuvwxyz";
        for(int i =0;i<temp.length();i++)
        {
           if(!set.contains(temp.charAt(i)))
           {
               return false;
           }
        }
        return true;
       
    }
}

 
 public class Q14_Panagram {
public static void main(String[] args) {
   String s ="jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
   boss ans = new boss(); //this is object of the class

   System.out.println(ans.Panagram(s)); //this get the answer true or false;
 }
    
 }
