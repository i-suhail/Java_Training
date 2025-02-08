package Day_5;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        int max = arr[0];

        System.out.println("Enter the value for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        for (int j = 1; j < arr.length; j++) {
            if (max<arr[j]) {
                max = arr[j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
