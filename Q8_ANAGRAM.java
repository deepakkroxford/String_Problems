import java.util.Arrays;

class XX{
    public static boolean isAnagram(String a, String b) {
        // Your code here
        int freq1[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freq1[a.charAt(i) - 'a']++;

        }

        int freq2[] = new int[26];

        for (int i = 0; i < b.length(); i++) {
            freq2[b.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}

public class Q8_ANAGRAM {
    public static void main(String[] args) {
        String inputString = "abcdeabsd";
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        String inputStringg = "sfasdfasf ";
        char tempArrayy[] = inputStringg.toCharArray();
        Arrays.sort(tempArrayy);

        System.out.println(tempArray);
        System.out.println(tempArrayy);

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] != tempArrayy[i]) {
                System.out.println(" not anagram");
                break;
            } else {
                System.out.println("anagram");
            }
        }

        String a = "abcdeabsd";
        String b = "sfasdfasf";
        System.out.println(XX.isAnagram(a, b));





    }
}
