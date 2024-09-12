import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q19_short_chracter_by_frequency {
    public static void main(String[] args) {
        /*
         * Given a string s, sort it in decreasing order based on the frequency of the
         * characters. The frequency of a
         * character is the number of times it appears in the string.
         * 
         * Return the sorted string. If there are multiple answers, return any of them.
         * 
         * 
         * 
         * Example 1:
         * Input: s = "tree"
         * Output: "eert"
         * Explanation: 'e' appears twice while 'r' and 't' both appear once.
         * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid
         * answer.
         * 
         * Example 2:
         * Input: s = "cccaaa"
         * Output: "aaaccc"
         * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and
         * "aaaccc" are valid answers.
         * Note that "cacaca" is incorrect, as the same characters must be together.
         * 
         * Example 3:
         * Input: s = "Aabb"
         * Output: "bbAa"
         * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
         * Note that 'A' and 'a' are treated as two different characters.
         * 
         */
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "tree";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));

        // we can also do like this
        // Comparator<Character> comparator = new Comparator<Character>() {
        // @Override
        // public int compare(Character a, Character b) {
        // // Compare the frequencies in descending order
        // return map.get(b) - map.get(a);
        // }
        // };

        // Sort the list using the comparator
        // Collections.sort(chars, comparator);

        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }

        // //we can also print like this
        // chars.forEach(ch -> {
        // int frequency = map.get(ch);
        // for (int i = 0; i < frequency; i++) {
        // sb.append(ch);
        // }
        // });
        System.out.println(sb.toString());

    }
}
