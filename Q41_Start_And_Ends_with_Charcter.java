class Count_Substrings_Starting_and_Ending_with_Given_Character {
    public int count_substringON2(String s, char c) {
        int count = 0;
        String target = String.valueOf(c);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (s.substring(i, j).endsWith(target) && s.substring(i, j).startsWith(target)) {
                    count++;
                }
            }
        }
        return count;

    }
    public int count_substringON(String s,char c)
    {
        int count =0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)==c){
                count++;
            }
        }
        return (count*(count+1)/2);
    }

}

public class Q41_Start_And_Ends_with_Charcter {
    public static void main(String[] args) {
        /*leetcode->3084
         * You are given a string s and a character c. Return the total number of
         * substrings
         * of s that start and end with c.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "abada", c = "a"
         * 
         * Output: 6
         * 
         * Explanation: Substrings starting and ending with "a" are: "abada", "abada",
         * "abada", "abada", "abada", "abada".
         * 
         * Example 2:
         * 
         * Input: s = "zzz", c = "z"
         * 
         * Output: 6
         * 
         * Explanation: There are a total of 6 substrings in s and all start and end
         * with "z".
         * 
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 105
         * s and c consist only of lowercase English letters.
         */
        Count_Substrings_Starting_and_Ending_with_Given_Character ans =  new Count_Substrings_Starting_and_Ending_with_Given_Character();
        String s ="abada";
        char c ='a';
        System.out.println(ans.count_substringON(s, c));
    }
}
