/**
 * 
 */
class substring_with_equal_numberUpeerandLowercase {
    public int countsubstring(String s) {
       int lowercase=0;
       int uppercase=0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
        lowercase=0;
        uppercase=0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) > 'a' && s.charAt(j) < 'z') {
                    lowercase++;
                } else {
                    uppercase++;
                }
                if (uppercase == lowercase) {
                    ans++;
                }
            }
        }
        return ans;
    }

}

public class Q42_CountSubstring_equalNumber_of_upper_and_lowercase {
    public static void main(String[] args) {
        /*
         * Input: S = “gEEk”
         * Output: 3
         * Explanation:
         * The following are the substrings having an equal number of lowercase and
         * uppercase letters:
         * 
         * “gE”
         * “gEEk”
         * “Ek”
         * Therefore, the total count of substrings is 3.
         * 
         * Input: S = “WomensDAY”
         * Output: 4
         */
        substring_with_equal_numberUpeerandLowercase ans = new substring_with_equal_numberUpeerandLowercase();
        String s ="WomensDAY";
        System.out.println("the number of equal uppercase and lowercase substring  is "+ans.countsubstring(s));
    }
}
