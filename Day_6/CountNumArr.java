import java.util.Arrays;

public class CountNumArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,5,4};
        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int no = arr[i];
            int count = 1;

            for (int j = i+1; j < arr.length; j++) {
                if (no==arr[j]) {
                    count++;
                    freq[j] = -1;
                }
                if (freq[i]!=-1) {
                    freq[i]=count;
                }
            }
        }
        System.out.println(Arrays.toString(freq));
        
        for (int k = 0; k < arr.length; k++) {
            if (freq[k]!=-1) {
                System.out.println(arr[k]+"comes"+freq[k]+" times");
            }
        }
    }
}
