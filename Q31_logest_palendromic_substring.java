// class isplaindrome
// {
//     boolean palindrome(String s,int i,int j )

//     {
//         i=0;
//         j = s.length()-1;
//         while(i<j)
//         {
//             if(s.charAt(i)!=s.charAt(i))
//             {
//                 return false;
//             }
//             i++;
//             j--;
//         } 
//         return true ;
//     } 
// }

class palindromicsubstringprinting {
  boolean palindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}

public class Q31_logest_palendromic_substring {
  public static void main(String[] args) {
    palindromicsubstringprinting ans = new palindromicsubstringprinting();

    
    String s = "forgeeksskeegfor";
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        if (ans.palindrome(s.substring(i, j)) == true &&  j - i > end - start) {
          start = i;
          end = j;

        }
      }
    }
    System.out.println(s.substring(start, end));


    // fo geeksskeeg f
    // geeksskeeg

  }
}
