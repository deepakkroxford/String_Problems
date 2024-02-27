import java.util.HashMap;

public class Q17_first_unique_character {
    public static void main(String[] args) {

        /*
         * Given a string s, find the first non-repeating character in it and return its
         * index. If it does not exist, return -1.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "leetcode"
         * Output: 0
         * 
         * Example 2:
         * Input: s = "loveleetcode"
         * Output: 2
         * 
         * Example 3:
         * Input: s = "aabb"
         * Output: -1
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 105
         * s consists of only lowercase English letters.
         */
        HashMap<Character, Integer> map = new HashMap<>();

        String s = "zxvczbtxyzvy";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(i);
                break;
            }
        }

        /*
         * Approach 2
         * 
         * 
         * int temp []= new int [26];
         * for(int i =0;i<s.length();i++)
         * {
         * char ch = s.charAt(i);
         * temp[ch-'a']++; //this is use for count the occurance of character in a given
         * string
         * }
         * 
         * for(int i=0;i<s.length();i++)
         * {
         * int ch = s.charAt(i);
         * if(temp[ch-'a']==1) //this if code use to check the first charcter that appear first time and return the value 
         * {
         * return i;
         * }
         * }
         * return -1;
         * }
         * }
         * 
         */

    }
}
