
class keypad{
    public  int checknumber (char ch)
    {
        if(ch=='a' || ch=='b' || ch =='c')
        {
            return 2;
        }
        if(ch=='d' || ch=='e' || ch =='f')
        {
            return 3;
        }
        if(ch=='g' || ch=='h' || ch =='i')
        {
            return 4;
        }
        if(ch=='j' || ch=='k' || ch =='l')
        {
            return 5;
        }
        if(ch=='m' || ch=='n' || ch =='o')
        {
            return 6;
        }
        if(ch=='p' || ch=='q' || ch =='r' || ch =='s')
        {
            return 7;
        }
        if(ch=='t' || ch=='u' || ch =='v')
        {
            return 8;
        }
        else{
            return 9;
        }
    }

}


public class Q34_Keypad_typing {

    public static void main(String[] args) {
        keypad ans = new keypad();
        String s ="geeksforgeeks";
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            sb.append(ans.checknumber(ch));
        }
        System.out.println(sb);
    }
}