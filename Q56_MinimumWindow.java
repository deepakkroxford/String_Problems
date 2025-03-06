import java.util.*;

public class Q56_MinimumWindow {


    public String minWindow(String s, String t) {
        //base case 
        if(t.length()>s.length())
        {
            return "";
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int i =0, j=0;
        int requiredcount = t.length();
        int minWindow = Integer.MAX_VALUE;
        int start = 0;
        while(j<s.length())
        {
            char ch = s.charAt(j);
           if(map.containsKey(ch) && map.get(ch)>0)
           {
            requiredcount--;
           } 

           map.put(ch,map.getOrDefault(ch,0)-1);
           while(requiredcount==0)
           {
            int currentWindow = j-i+1;
               if(minWindow>currentWindow)
               {
                   minWindow = currentWindow;
                   start = i;
               }
               char left = s.charAt(i);
               if(map.containsKey(left) && map.get(left)>=0)
               {
                   requiredcount++;
               }
               map.put(left,map.getOrDefault(left,0)+1);
               i++;
           }
              j++;
        }

        return minWindow==Integer.MAX_VALUE?"":s.substring(start,start+minWindow);
    }
    public static void main(String[] args) {
        /*
          leetcode - 76 
          https://leetcode.com/problems/minimum-window-substring/description/
         * Given two strings s and t of lengths m and n respectively, return the minimum
         * window substring of s such that every character in t (including duplicates)
         * is included in the window. If there is no such substring, return the empty
         * string "".
         * 
         * The testcases will be generated such that the answer is unique.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "ADOBECODEBANC", t = "ABC"
         * Output: "BANC"
         * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C'
         * from string t.
         * Example 2:
         * 
         * Input: s = "a", t = "a"
         * Output: "a"
         * Explanation: The entire string s is the minimum window.
         * Example 3:
         * 
         * Input: s = "a", t = "aa"
         * Output: ""
         * Explanation: Both 'a's from t must be included in the window.
         * Since the largest window of s only has one 'a', return empty string.
         * 
         * 
         * Constraints:
         * 
         * m == s.length
         * n == t.length
         * 1 <= m, n <= 105
         * s and t consist of uppercase and lowercase English letters.
         * 
         * 
         * Follow up: Could you find an algorithm that runs in O(m + n) time?
         */
        Q56_MinimumWindow obj = new Q56_MinimumWindow();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(obj.minWindow(s, t)); // BANC
        String s1 = "a";
        String t1 = "a";
        System.out.println(obj.minWindow(s1, t1)); // a
        String s2 = "a";
        String t2 = "aa";
        System.out.println(obj.minWindow(s2, t2)); // ""
        
    }
}
