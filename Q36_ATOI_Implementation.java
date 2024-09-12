
class atoi {
   int atoii(String s) {

      int sign = 1;
      int i = 0;
      if (s.charAt(0) == '-') {
         sign = -1;
         i++;
      }
      int ans = 0;
      for (; i < s.length(); i++) {

         if (s.charAt(i) < '0' || s.charAt(i) > '9') {
            return -1;
         } else {
            ans = ans * 10 + (s.charAt(i) - '0');
         }
      }
      ans = ans * sign;

      // s = "-123"
      // * Output:
      // * -123
      return ans;

   }
}

class Atoixxx {
  public int atoi(String s) {
      int sign = 1;
      int i = 0;
      String[] arr = s.split("");

      if (arr[0].equals("-")) {
         sign = -1;
         i++;
      }

      int ans = 0;
      for (; i < arr.length; i++) {
         String sn = arr[i];
         if (sn.charAt(0) < '0' || sn.charAt(0) > '9') {
            return -1; // Invalid input, non-digit character found
         } else {
            ans = ans * 10 + (sn.charAt(0) - '0');
         }
      }

      ans = ans * sign;

      // s = "-123"
      // Output: -123
      return ans;
   }
}

public class Q36_ATOI_Implementation {
   public static void main(String[] args) {
      /*
       * Given a string, s, the objective is to convert it into integer format without
       * utilizing any built-in functions. If the conversion is not feasible, the
       * function should return -1.
       * 
       * Note: Conversion is feasible only if all characters in the string are numeric
       * or if its first character is '-' and rest are numeric.
       * 
       * Example 1:
       * 
       * Input:
       * s = "-123"
       * Output:
       * -123
       * 
       * Explanation:
       * It is possible to convert -123 into an integer
       * and is so returned in the form of an integer
       * Example 2:
       * 
       * Input:
       * s = "21a"
       * Output:
       * -1
       * 
       * Explanation:
       * The output is -1 as, due to the inclusion of 'a',
       * the given string cannot be converted to an integer.
       * Your Task:
       * You do not have to take any input or print anything. Complete the function
       * atoi() which takes a string s as an input parameter and returns an integer
       * value representing the given string. If the conversion is not feasible, the
       * function should return -1.
       * 
       * |s| = length of string str.
       * Expected Time Complexity: O( |s| ),
       * Expected Auxiliary Space: O(1)
       * 
       */

      atoi ans = new atoi();
      Atoixxx ans1 = new Atoixxx();
      String s = "0032";
      System.out.println(ans.atoii(s));
      String s1 = "-123";
      System.out.println(ans1.atoi(s1));

   }
}
