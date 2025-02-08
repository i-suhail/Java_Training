

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sqr = num*num;
        int val = sqr;
        int rem;
        int sum=0;

        while (val!=0) {
            rem = val%10;
            sum += rem;
            val /= 10; 
        }
        // System.out.println("The neon of the number is: "+sqr);
        System.out.println(sum==num?"The number is Neon-Number":"The number is not Neon.");

    }
}
