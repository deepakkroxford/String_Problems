public class Q7_rotate_by_two {
    public static void main(String[] args) {
        /*
         * Given two strings a and b.
         * The task is to find if the string 'b' can be obtained by rotating (in any
         * direction) string 'a' by exactly 2 places.
         * 
         * Input:
         * a = amazon
         * b = azonam
         * Output:
         * 1
         * Explanation:
         * amazon can be rotated anti-clockwise by two places, which will make it as
         * azonam.
         * 
         * Input:
         * a = geeksforgeeks
         * b = geeksgeeksfor
         * Output:
         * 0
         * Explanation:
         * If we rotate geeksforgeeks by two place in any direction, we won't get
         * geeksgeeksfor.
         * 
         */

        class Solution {
            // Function to check if a string can be obtained by rotating
            // another string by exactly 2 places.
            public static boolean isRotated(String str1, String str2) {
                // Your code here
                int n = str1.length();
                if (str1.length() != str2.length()) {
                    return false;
                }
                if (n <= 1) {
                    if (str1.equals(str2))
                        return true;
                    return false;
                }

                String clock = str1.substring(2) + str1.substring(0, 2);
                String anticlock = str1.substring(n - 2) + str1.substring(0, n - 2);

                if (str2.equals(clock) || str2.equals(anticlock)) {
                    return true;
                }
                return false;

            }

        }

    }
}
