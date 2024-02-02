/**
 * Q15_reverseWord
 */
public class Q15_reverseWord {

    public static void main(String[] args) {
        String s ="I am good boy";
        String arr[]=s.split(" ");
        int i =0;
       int j=arr.length-1;
       while(i<j)
       {
        String temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

       }
       for (String string : arr) {
        System.out.print(string+" ");
       }
    }
}