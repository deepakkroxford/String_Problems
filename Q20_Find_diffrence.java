class Solution {
    public char findTheDifference(String s, String t) {
        
        int total=0;
        for(int i=0;i<t.length();i++)
        {
                char ch = t.charAt(i);
               total = total + (int)ch;
        }
        for(int i=0;i<s.length();i++)
        {
               char ch = s.charAt(i);
               total =total - (int)ch;
        }
        
        char ans = (char)total;
        return ans;
    }
}


public class Q20_Find_diffrence {
   public static void main(String[] args) {
    Solution ans = new Solution();

    String s ="abcd";
    String t ="abcde";

    System.out.println(ans.findTheDifference(s,t));
   } 
}
