import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int div = 2;

        while(div<=n/2){
            if (n/div==div) {
                System.out.println("The square of "+n+" is: "+div);
                break;
            }
            div++;
        }
    }
}
