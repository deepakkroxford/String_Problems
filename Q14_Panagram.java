import java.util.HashSet;

class boss { // this is class
    public boolean Panagram(String s) // this is method
    {
        HashSet<Character> set = new HashSet<>();
        String ans = s.toLowerCase();
        if (s.length() < 26) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            set.add(ans.charAt(i));
        }
        String temp = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < temp.length(); i++) {
            if (!set.contains(temp.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public boolean Panagram1(String s) {
        if (s.length() < 26) {
            return false;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean Panagram2(String s) {
        if (s.length() < 26) {
            return false;
        }
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;

    }
}

public class Q14_Panagram {
    public static void main(String[] args) {
        String s = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        boss ans = new boss(); // this is object of the class

        System.out.println(ans.Panagram2(s1)); // this get the answer true or false;
    }

}
