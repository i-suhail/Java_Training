package Day_5;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        
        System.out.println("Enter the value for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        int min = arr[0];
        

        for (int j = 1; j < arr.length; j++) {
            if (min>arr[j]) {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
