import java.util.Arrays;

class FrequencyChecker {

    static boolean check(int[] arr) {
        int n = -1;
        for (int i : arr) {
            if (i > 0) {
                if (n == -1) {
                    n = i;
                } else if (i != n) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean sameFreq(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                arr[ch - 'a']++;
            }
        }

        if (check(arr)) {
            return true;
        }

        

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                arr[i]--;
                if (check(arr))
                    return true;
                arr[i]++;
            }
        }
        return false;
        /*
         * This code is part of the sameFreq method and is responsible for iterating
         * through each character's frequency in the array arr, decrementing it
         * temporarily, checking if the frequencies become equal using the check method,
         * and then restoring the frequency. Here's an explanation:
         * For Loop:
         * The loop runs from i = 0 to i = 25, iterating over each index of the array
         * arr.
         * Conditional Check:
         * Inside the loop, the code checks if the frequency of the character
         * corresponding to the current index (arr[i]) is greater than 0. This ensures
         * that the character has a non-zero frequency.
         * Decrement Frequency:
         * If the frequency is greater than 0, it decrements the frequency by one
         * (arr[i]--). This simulates the removal of one occurrence of the current
         * character.
         * Check Frequencies:
         * After decrementing the frequency, it calls the check(arr) method to check if
         * the frequencies have become equal. If the frequencies are equal, it means
         * it's possible to make all frequencies equal by removing at most one
         * character, and the method returns true.
         * Restore Frequency:
         * If the frequencies are not equal, it restores the frequency by incrementing
         * it back (arr[i]++). This step is crucial because the loop is meant to explore
         * different scenarios by temporarily removing one occurrence of each character.
         * Return Statement:
         * If the loop completes without finding a valid scenario where frequencies
         * become equal, the method returns false. This indicates that it's not possible
         * to make all frequencies equal by removing at most one character.
         */
    }
}

public class Q37_CheckIfFrequenciesCanEqual {

    public static void main(String[] args) {

        /*
         * Given a string s which contains only lower alphabetic characters, check if it
         * is possible to remove at most one character from this string in such a way
         * that frequency of each distinct character becomes same in the string. Return
         * true if it is possible to do else return false.
         * 
         * Note: The driver code print 1 if the value returned is true, otherwise 0.
         * 
         * Example 1:
         * 
         * Input:
         * s = "xyyz"
         * Output:
         * 1
         * Explanation:
         * Removing one 'y' will make frequency of each character to be 1.
         * Example 2:
         * 
         * Input:
         * s = "xxxxyyzz"
         * Output:
         * 0
         * Explanation:
         * Frequency can not be made same by removing at most one character.
         * Your Task:
         * You dont need to read input or print anything. Complete the function
         * sameFreq() which takes a string as input parameter and returns a boolean
         * value denoting if same frequency is possible or not.
         * 
         * Expected Time Complexity: O(|s|)
         * Expected Auxiliary Space: O(1)
         */

        // Example 1
        FrequencyChecker ans = new FrequencyChecker();
        String s1 = "xyyz";
        System.out.println(ans.sameFreq(s1)); // Output: true

        // Example 2
        String s2 = "xxxxyyzz";
        System.out.println(ans.sameFreq(s2)); // Output: false
    }
}
