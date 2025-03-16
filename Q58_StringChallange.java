public class Q58_StringChallange {
    public static boolean checkString(String str)
    {

        int upperCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        int mathExpression = 0;
        if(str.length()<7 || str.length()>30)
        {
            return false;
        }
        if(str.contains("Password") || str.contains("password"))
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                upperCount++;
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                lowercaseCount++;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                numberCount++;
            }
            else{
                mathExpression++;
            }
        }

        if(upperCount>0 && lowercaseCount >0 && numberCount>0 && mathExpression>0 )
        {
            return true;
        }
        

            return false;
    }
    public static void main(String[] args) {
        /*
         * So the question is we have to check the stirng :
         * 1 It contains one capital letter 
         * 2. I must conatin one Number 
         * 3. I must contain puncutaion mark or mathematical symbole
         * 4. It can not contain a word password
         * 5 Larger than 7 character and less than 31.
         */

         String str = "A7#secureKey";
         String str2 = "mypassword123";
        boolean ans =  checkString(str2);
        System.out.println(ans);
    }
}
