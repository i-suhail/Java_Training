import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int rem;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=num;

        while(num!=0){
            rem = num%10;
            rem=rem*rem*rem;
            sum=rem+sum;
            num= num/10;

        }
        // System.out.println(sum);
        System.out.println(sum==c?"Armstrong":"Not an Armstrong");
    }
}