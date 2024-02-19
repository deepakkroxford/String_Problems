/**
 *
 */
class solutionss {
    boolean isplaindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

public class Q23_find_first_palindromic_string_in_array {
    public static void main(String[] args) {

        /*
         * 
         * 2108. Find First Palindromic String in the Array
         * 
         * Given an array of strings words, return the first palindromic string in the
         * array. If there is no such string, return an empty string "".
         * 
         * A string is palindromic if it reads the same forward and backward.
         * 
         * Example 1:
         * Input: words = ["abc","car","ada","racecar","cool"]
         * Output: "ada"
         * Explanation: The first string that is palindromic is "ada".
         * Note that "racecar" is also palindromic, but it is not the first.
         * 
         * Example 2:
         * Input: words = ["notapalindrome","racecar"]
         * Output: "racecar"
         * Explanation: The first and only string that is palindromic is "racecar".
         * 
         * 
         * Example 3:
         * Input: words = ["def","ghi"]
         * Output: ""
         * Explanation: There are no palindromic strings, so the empty string is
         * returned.
         * 
         */
        solutionss ans = new solutionss();
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (ans.isplaindrome(s)) {
                System.out.println("the first palindromic string is ===>>  " + s);
                break;
            }
        }

        /*
         * second way is
         * 
         * for(int i = 0; i < words.length; i++)
         * {
         * String s = words[i];
         * int x=0;
         * int y=s.length()-1;
         * while(x<=y)
         * {
         * if(s.charAt(x)!=s.charAt(y))
         * {
         * break;
         * }
         * x++;
         * y--;
         * }
         * if(x>y)
         * {
         * System.out.println(s);
         * break;
         * }
         * }
         */
    }
}
