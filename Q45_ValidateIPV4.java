class ValidateIpaddress {
    public static boolean ipv4(String str) {
        String [] arr = str.split("\\.");
        
        if(arr.length!=4) //beacuse in the ip address there should be four parts
        {
            return false;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            String s = arr[i];
            if(s.length()==0 || (s.length()>1 && s.charAt(0)=='0'))
            {
                return false;
            }
            try{
                int num = Integer.parseInt(s);
                
                if(num<0 || num>255)
                {
                    return false;
                }
            }
            catch(NumberFormatException e)
            {
                return false;
            }
        }
        return true;
    }
}

public class Q45_ValidateIPV4 {
    public static void main(String[] args)
     {
        /*
         *
         * To validate an IPv4 address in the form of a string, we need to check several
         * conditions:
         * 
         * 1. Length Check: The string should have a length between 1 and 15 characters.
         * 2. Dot Count: The string should contain exactly three dots (.).
         * 3. Each Segment: The string should be split into four segments by the dots.
         * Each segment must:
         * • Be a number.
         * • Be within the range of 0 to 255.
         * • Not have leading zeros unless the segment is “0”.
         * 
         * Here’s a step-by-step approach to solve the problem:
         * 
         * 1. Split the string by dots.
         * 2. Check if there are exactly four parts.
         * 3. Validate each part:
         * • Each part should be a number between 0 and 255.
         * • Ensure no leading zeros unless the part is “0”.
         * 
         * If all conditions are satisfied, the IP address is valid.
         * 
         */

         String str1 = "222.111.111.111";
         String str2 = "5555..555";
         System.out.println(ValidateIpaddress.ipv4(str1)); // true
        System.out.println(ValidateIpaddress.ipv4(str2)); // false
    }
}
