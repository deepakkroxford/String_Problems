public class Q4_reverseEach_character {
    public static void main(String[] args) {
        String s = "geeks quiz practice code";
        String ans = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }

            else {
                sb.reverse();
                ans = ans + sb;
                ans = ans + " ";
                sb = new StringBuilder("");
            }
        }
        ans = ans + sb.reverse();
        sb = new StringBuilder("");
        System.out.println(ans);

    }
}
