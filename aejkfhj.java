import java.util.Arrays;

public class aejkfhj {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 8, 2, 5, 7 ,133,34,223,0,9};

        // output = 8,1,7,2,5,3

        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order:");

        int arr2[] = new int[arr.length];
        int z = 0;
        int i = 0;
        int j = arr.length - 1;
        while (z < arr2.length) {
            if (j >= 0) {
                arr2[z] = arr[j];
                z++;
                j--;
            }

            if (i < j) {
                arr2[z] = arr[i];
                i++;
                z++;
            }

        }

        for (int x = 0; x < arr2.length; x++) {
            System.out.println(arr2[x]);
        }

    }
}
