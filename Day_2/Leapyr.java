import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
    // wtp to find whether the year is leap or not
        
        int Year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        Year = sc.nextInt();

        if(Year%4==0 && Year%100!=0 || Year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
