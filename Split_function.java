public class Split_function {
    public static void main(String[] args) {
        String s ="I am good boy";
       //split change the given string in to the string array
       // the input of the split function is how we want to divide the string
       // for using the multiple delimeter we use square bracket [ .,!] 
       String arr[] = s.split(" ");
      //String[] arr = {"h","e","l","l","o"};
     
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
