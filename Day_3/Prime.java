import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;

        
        for(int i=1; i<=n; i++){
            if((n/2)%i==0){
                count = count +1;
            }
        }
        if (count>2) {
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
