package SlidingWindowProblem;

public class  LongestSubstringAt_Least_K_RepeatingCharacters {

    public int longestSubstring(String s, int k) {

        // first step we have to find the frequency of each character
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // now we have to find the first character which is less than k and split the string if less than k 
        // and call the function recursively
        boolean allLength = true;
        int start = 0;
        int max = 0;
        for( int end=0;end<s.length();end++)
        {
            if(freq[s.charAt(end)-'a']<k && freq[s.charAt(end)-'a']>0)
            {
                allLength = false; // it means in between we have a character which is less than k
                // now we have to split the string and call the function recursively
                String left = s.substring(start, end);
                max = Math.max(max, longestSubstring(left, k));
                start = end+1; // now we have to move the start pointer to the next character
                
            }
           
        }

        if(allLength)
        {
            return s.length(); // it means all the characters are greater than k
        }
        else{
            String left = s.substring(start, s.length());
            max = Math.max(max, longestSubstring(left, k));
        }
        return max;
    }

    public static void main(String[] args) {
        /*
         * Leetcode 395. Longest Substring with At Least K Repeating Characters
         * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
         * 
         * 
         * 
         * Given a string s and an integer k, return the length of the longest substring
         * of s such that the frequency of each character in this substring is greater
         * than or equal to k.
         * 
         * Example 1:
         * Input: s = "aaabb", k = 3
         * Output: 3
         * Explanation: The longest substring is "aaa" with length 3.
         * 
         * Example 2:
         * Input: s = "ababbc", k = 2
         * Output: 5
         * Explanation: The longest substring is "ababb" with length 5.
         */

        LongestSubstringAt_Least_K_RepeatingCharacters obj = new LongestSubstringAt_Least_K_RepeatingCharacters();
        String s = "aaabb";
        int k = 3;
        System.out.println(obj.longestSubstring(s, k)); // 3
        s = "ababbc";
        k = 2;
        System.out.println(obj.longestSubstring(s, k)); // 5
        s = "aabbcc";
        k = 2;
        System.out.println(obj.longestSubstring(s, k)); // 6
        s = "aabbcc";
        k = 3;
        System.out.println(obj.longestSubstring(s, k)); // 0
        s = "aaabbbccc";
        k = 3;
        System.out.println(obj.longestSubstring(s, k)); // 9
        s = "aaabbbccc";
        k = 4;
        System.out.println(obj.longestSubstring(s, k)); // 0
    }
}