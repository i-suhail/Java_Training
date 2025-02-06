import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = num; i>0; i=i/10) {
            count++;
        }
        System.out.println("no of dgts: "+count);

        int rem, result=0;
        int temp=num;

        while(temp!=0){
            rem = temp%10;
            result = result + (int)Math.pow(rem, count);
            temp = temp/10;
        }

        // if(result == num){
        //     System.out.println("The given number is Armstrong...");
        // }
        // else{
        //     System.out.println("The given number is not Armstrong...");
        // }
        
        System.out.println(result==num? "The given number is Armstrong..." : "The given number is not Armstrong...");
    }
}