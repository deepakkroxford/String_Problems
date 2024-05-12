class printFirstcharcter_of_word
{
    public String firstcharofword(String s)
    {
        StringBuilder sc = new StringBuilder();
        String arr[]=s.split(" ");
        for(int i =0;i<arr.length;i++)
        {
            String str= arr[i];
            sc.append(str.charAt(0));
        }


        return sc.toString();
    }
}


public class Q32_print_first_char_word {
    public static void main(String[] args) {
        printFirstcharcter_of_word res = new printFirstcharcter_of_word();
        String s = "geeks for geeks";
        //using split method 
        System.out.println(res.firstcharofword(s));
       
        char arr[] = s.toCharArray();
        StringBuilder sc = new StringBuilder();
        sc = sc.append(arr[0]);

        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == ' ') {
                sc.append(arr[i + 1]);
            }
            i++;
        }
        System.out.println(sc);

    }
}
