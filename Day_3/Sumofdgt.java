import java.util.Scanner;

public class Sumofdgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int rem;
        int sum=0;
        

        // int num = sc.nextInt();
        for (int i = n; i!=0;i/=10){
            rem = n%10;
            sum = sum+ rem;
            n/=10;
        }
        System.out.println(sum);
    }
}