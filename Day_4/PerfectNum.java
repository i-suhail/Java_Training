import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        int sumFact=0;

        // -----For finding FACTORS------
        for(int i = 1; i<=num/2; i++){
            if (num%i==0) {
                sumFact += i; 
            }
        }
        System.out.println(sumFact==num?"The number is the Perfect Number.":"It is not a perfect number.");
        sc.close();
    }
}
