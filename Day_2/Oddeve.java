import java.util.Scanner;

public class Oddeve{
    // wtp to find odd eve
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Odd or Even: ");

        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is an Even number.");
        }
        else {
            System.out.println(n+" is an Odd number.");
        }
        // System.out.println((n%2==0)?("Even"):("Odd"));
    }
}