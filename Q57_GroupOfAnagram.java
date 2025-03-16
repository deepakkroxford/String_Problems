import java.util.*;

public class Q57_GroupOfAnagram {
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
    public static void main(String[] args) {
        /*
        Leetcode - 49 
        https://leetcode.com/problems/group-anagrams/
         * Given an array of strings strs, group the anagrams together. You can return
         * the answer in any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: strs = ["eat","tea","tan","ate","nat","bat"]
         * 
         * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         * 
         * Explanation:
         * 
         * There is no string in strs that can be rearranged to form "bat".
         * The strings "nat" and "tan" are anagrams as they can be rearranged to form
         * each other.
         * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to
         * form each other.
         * Example 2:
         * 
         * Input: strs = [""]
         * 
         * Output: [[""]]
         * 
         * Example 3:
         * 
         * Input: strs = ["a"]
         * 
         * Output: [["a"]]
         * 
         * 
         * 
         * Constraints:
         * 
         * 1 <= strs.length <= 104
         * 0 <= strs[i].length <= 100
         * strs[i] consists of lowercase English letters.
         */

        Q57_GroupOfAnagram groupOfAnagram = new Q57_GroupOfAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupOfAnagram.groupAnagrams(strs)); // [[eat, tea, ate], [bat], [tan, nat]]

    }
}
