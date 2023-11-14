public class Q6_Sort_string_by_Alphabet
 {
    public static void main(String[] args) {
        String sc = "geeksforgeeks";
        char arr[] = sc.toCharArray();
        char temp;
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        // for(int i =0;i<arr.length;i++)
        // {
        //     if(arr[i]>arr[i+1])
        //     {
        //         temp = arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1]=temp;
        //     }
        //     i=-1;
        // }
    
            System.out.println(arr);
        
    }
}
