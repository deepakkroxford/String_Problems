public class Q16_find_longest_str {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor",
        "GeeksforGeek", "GeeksforGeeks" };
        String ans= names[0];
        for(int i =0;i<names.length;i++)
        {
            if(names[i].length()>ans.length())
            {
                ans=names[i];
            }
        }
        System.out.println(ans);
    }
}
