package Day_5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // first way
        int a []= {1,2,3,4,5};
        System.out.println(a);
        // [I@372f7a8d

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }

        // Heap 

        // 2nd way
        Scanner sc = new Scanner(System.in);
        
        int b[] = new int[5];
        
        for (int i = 0; i < b.length; i++) {
            b[i]= sc.nextInt();
        }

        for(int value:b){
            System.out.println(value+" ");
        }
    }
}