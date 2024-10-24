import java.util.HashMap;

public class Q48_SecondMostRepString {
    public static void main(String[] args) {
        /*
         * Given a sequence of strings, the task is to find out the second most repeated
         * (or frequent) string in the given sequence.
         * 
         * Note: No two strings are the second most repeated, there will be always a
         * single string.
         * 
         * Example 1:
         * 
         * Input:
         * N = 6
         * arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
         * Output: bbb
         * Explanation: "bbb" is the second most
         * occurring string with frequency 2.
         * 
         * Example 2:
         * 
         * Input:
         * N = 6
         * arr[] = {geek, for, geek, for, geek, aaa}
         * Output: for
         * Explanation: "for" is the second most
         * occurring string with frequency 2.
         * 
         */

        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        // Here we count The Frequency
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // Here i find the value of maxfreq
        int max = Integer.MIN_VALUE;
        for (var e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
            }
        }

        //Here i find the minimum value 
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ele = map.get(arr[i]);

            if (max > ele && ele > min) {
                min = ele;
            }
        }
        System.out.println(min);
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == min) {
                ans = ans + arr[i];
                break;
            }
        }
        System.out.println(ans); //bbb

    }
}
