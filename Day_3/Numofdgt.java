import java.util.Scanner;

public class Numofdgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int rem;
        int count=1;

        while(n!=0){
            rem = n%10; 
            count ++;
            n=n/10;
        }
        // System.out.println(count);

        // for(int i=1; i<n; i++){
        //     //rem =n%10;
        //     count++;
        //     n=n/10;
        // }
        System.out.println(count);

    }
}