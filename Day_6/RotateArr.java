import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(arr);
        int d = 2;
        
        for (int j = 0; j < d; j++) {
            int first = arr[0];
            
            for (int i = 0; i <= arr.length - 2; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
            System.out.println(Arrays.toString(arr));
        }

    }
}
