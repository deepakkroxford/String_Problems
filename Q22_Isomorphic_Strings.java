import java.util.HashMap;



public class Q22_Isomorphic_Strings {
    public static void main(String[] args) {
        /*
         * Given two strings 'str1' and 'str2', check if these two strings are
         * isomorphic to each other.
         * 
         * If the characters in str1 can be changed to get str2, then two strings, str1
         * and str2, are isomorphic. A character must be completely swapped out for
         * another character while maintaining the order of the characters. A character
         * may map to itself, but no two characters may map to the same character.
         * 
         * Example 1:
         * 
         * Input:
         * str1 = aab
         * str2 = xxy
         * Output:
         * 1
         * Explanation:
         * There are two different characters in aab and xxy, i.e a and b with frequency
         * 2 and 1 respectively.
         * 
         * Example 2:
         * Input:
         * str1 = aab
         * str2 = xyz
         * Output:
         * 0
         * Explanation:
         * There are two different characters in aab but there are three different
         * charactersin xyz. So there won't be one to one mapping between str1 and str2.
         */

        String str1 = "aab";
        String str2 = "xyz";
        if (str1.length() != str2.length()) {
            System.out.println("not isomorphic");
        }

        HashMap<Character, Character> ans = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char original = str1.charAt(i);
            char replace = str2.charAt(i);

            if (!ans.containsKey(original)) {
                if (!ans.containsValue(replace))
                    ans.put(original, replace);

                else {
                    break;
                }

            } else {
                char mapcharcter = ans.get(original);
                if (mapcharcter == replace) {
                    System.out.println("isomorphic string");
                } else {
                    System.out.println("not ismorphic");

                }
            }
        }

    }
}
