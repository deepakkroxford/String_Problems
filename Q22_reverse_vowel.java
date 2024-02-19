/**
 * solution
 */
class solutin {
    boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'A') {
            return true;
        }
        if (ch == 'e' || ch == 'E') {
            return true;
        }
        if (ch == 'i' || ch == 'I') {
            return true;
        }
        if (ch == 'o' || ch == 'O') {
            return true;
        }
        if (ch == 'u' || ch == 'U') {
            return true;
        } else {
            return false;
        }

    }

}

public class Q22_reverse_vowel {
    public static void main(String[] args) {
        solutin ans = new solutin();
        String s="leetcode";
        char arr[] = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
    
          if (ans.isvowel(arr[i]) && ans.isvowel(arr[j])) {
           char temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
    
            i++;
            j--;
          }
    
          else if (ans.isvowel(arr[i])) {
            j--;
          } else if (ans.isvowel(arr[j])) {
            i++;
          } else {
              //this else check if both are not string then it i++,j--;
            i++;
            j--;
          }
    }

    for(int x =0;x<arr.length;x++)
    {
        System.out.print(arr[x]+" ");
    }
}
}

