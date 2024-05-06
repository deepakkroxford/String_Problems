import java.util.HashSet;
import java.util.Set;

public class Q11_Remove_duplicate {
    public static void main(String[] args) {
        /*
         * Given a string without spaces, the task is to remove duplicates from it.
         * Note: The original order of characters must be kept the same.
         * 
         * Input: S = "zvvo"
         * Output: "zvo"
         * Explanation: Only keep the first
         * occurrence
         * 
         * Input: S = "gfg"
         * Output: gf
         * Explanation: Only keep the first
         * occurrence
         * 
         */

        // method 1

        String s = "zvvo";
        Set<Character> sc = new HashSet<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (sc.contains(s.charAt(i))) {
                continue;
            } else {
                ans = ans + Character.toString(s.charAt(i));
                sc.add(s.charAt(i));
            }
        }
        System.out.println(ans);

        // method 2
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean flage = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flage = true;
                    break;
                }
            }
            if (flage == false) {
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);


        /*
         *  HashSet<Character> map = new HashSet<>();
         StringBuilder sb = new StringBuilder();
         for(int i =0;i<str.length();i++)
         {
             if(!map.contains(str.charAt(i)))
             {
                 map.add(str.charAt(i));
                 sb.append(str.charAt(i));
             }
             
         }
         return sb.toString();
         
         */

    }
}
