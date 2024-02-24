import java.util.Arrays;

class long_comm_prefix {
    public static String prefix(String str[]) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        StringBuilder sc = new StringBuilder();
        int i = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sc.append(s1.charAt(i));
            } else {
                break;
            }
            i++;
        }
        return sc.toString();
    }
}

public class Q29_Long_Comm_prefix {
    public static void main(String[] args) {
        /* leetcode->>14
         * Write a function to find the longest common prefix string amongst an array of
         * strings.
         * 
         * If there is no common prefix, return an empty string "".
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: strs = ["flower","flow","flight"]
         * Output: "fl"
         * Example 2:
         * 
         * Input: strs = ["dog","racecar","car"]
         * Output: ""
         * Explanation: There is no common prefix among the input strings.
         * 
         * 
         * Constraints:
         * 
         * 1 <= strs.length <= 200
         * 0 <= strs[i].length <= 200
         * strs[i] consists of only lowercase English letters.
         */


        long_comm_prefix ans = new long_comm_prefix();
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(ans.prefix(strs));
    }
}
