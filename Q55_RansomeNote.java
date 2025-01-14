public class Q55_RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            freq1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            freq2[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] > freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * LeetCode -> 383 Ransome Note
         * https://leetcode.com/problems/ransom-note/description/
         * Given two strings ransomNote and magazine, return true if ransomNote can be
         * constructed by using the letters from magazine and false otherwise.
         * 
         * Each letter in magazine can only be used once in ransomNote.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: ransomNote = "a", magazine = "b"
         * Output: false
         * Example 2:
         * 
         * Input: ransomNote = "aa", magazine = "ab"
         * Output: false
         * Example 3:
         * 
         * Input: ransomNote = "aa", magazine = "aab"
         * Output: true
         * 
         * 
         * Constraints:
         * 
         * 1 <= ransomNote.length, magazine.length <= 105
         * ransomNote and magazine consist of lowercase English letters.
         */

         Q55_RansomeNote ransomeNote = new Q55_RansomeNote();
         String ransomNote1 = "a";
         String magazine1 = "b";
         System.out.println(ransomeNote.canConstruct(ransomNote1, magazine1)); // false
         String ransomNote2 = "aa";
         String magazine2 = "ab";
         System.out.println(ransomeNote.canConstruct(ransomNote2, magazine2)); // false
         String ransomNote3 = "aa";
         String magazine3 = "aab";
         System.out.println(ransomeNote.canConstruct(ransomNote3, magazine3)); // true
    }
}
