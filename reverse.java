public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i =0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int x =0;x<arr.length;x++)
        {
            System.out.println(arr[x]);
        }
    }
}
