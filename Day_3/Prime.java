// import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // int count = 0;

        // for (int i = 1; i <= n; i++) {
        //     if ((n / 2) % i == 0) {
        //         count = count + 1;
        //     }
        // }
        // if (count > 2 || n==1) {
        //     System.out.println("No");
        // } else {
        //     System.out.println("Yes");
        // }

        int n = 11;
        int div=2;
        boolean isPrime = true;

        while (div<=n/2) {
            if(n%div==0){
                isPrime = false;
            }    
            div++;
        }
        // if(isPrime){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }

        System.out.println(isPrime ? "Yes" : "No");
    }
}
