import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int rem;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=num;
        // int num = c;

        while(c!=0){
            rem = c%10;
            rem=rem*rem*rem;
            sum=rem+sum;
            c= c/10;

        }
        // System.out.println(sum);
        if(sum == num){
            System.out.println("The given number is amstron...");
        }
        else{
            System.out.println("The given number is not amstrong");
        }
    }
}
