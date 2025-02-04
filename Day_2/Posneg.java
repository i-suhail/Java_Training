import java.util.Scanner;

public class Posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        if(n<0){
            System.out.println("The given number is Negative.");
        }
        else if(n==0){
            System.out.println("The number is Zero.");
        }
        else{
            System.out.println("The number is Positive.");
        }

    }
}