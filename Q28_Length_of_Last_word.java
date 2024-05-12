class lastwordlen {
    int findLength(String s) {
        // code here
        s = s.trim();
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
            i--;
        }
        return count;
    }
}

public class Q28_Length_of_Last_word {
    public static void main(String[] args) {

        /*
        Gfg
         * Given a string S consisting of upper/lower-case alphabets and empty space
         * characters ‘ ‘. The string may contain spaces at the end. You will have
         * return the length of last word which consists of alphabets only.
         * 
         * Example 1:
         * Input:
         * S = "Geeks for Geeks"
         * Output: 5
         * Explanation: The last word is "Geeks"
         * of length 5.
         * 
         * Example 2:
         * Input:
         * S = "Start Coding Here "
         * Output: 4
         * Explanation: The last word is "Here" of
         * length 4.
         * 
         * Your Task:
         * You don't need to read input or print anything.Your task is to complete the
         * function findLength() which takes a single argument(string S) and returns the
         * length of last word of the string.
         * 
         * Expected Time Complexity: O(|S|).
         * Expected Auxiliary Space: O(1).
         * 
         * Constraints:
         * 1<=|S|<=100
         * 
         * |S| denotes the length of the string S.
         * 
         */
        lastwordlen ans = new lastwordlen();
        String s = "hkrrtbxwkabeihgcdqew" ;
        System.out.println(ans.findLength(s));
        s = s.trim();
        
        // Find the index of the last space character
        int lastSpaceIndex = s.lastIndexOf(' ');
        // If no space character is found, return the length of the entire string
        if (lastSpaceIndex == -1) {
           System.out.println(s.length());
        }
        
        // Return the length of the substring starting from the next character after the last space
        // until the end of the string
       System.out.println(s.length() - lastSpaceIndex - 1);

        

    }
}
