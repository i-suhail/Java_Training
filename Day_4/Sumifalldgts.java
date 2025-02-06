import java.util.Scanner;

public class Sumifalldgts {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int n = sc.nextInt();

        int sumdgts = sumofDigit(n);

        while (sumdgts>9) {
            sumdgts = sumofDigit(sumdgts);
        }
        System.out.println(sumdgts);
    }
    
    public static int sumofDigit(int n){
        
        int sum=0;
        while(n!=0){
            
            int rem = n%10;
            sum += rem; 
            n = n/10;
        
        }
        return sum;
        // System.out.println(count);
        // System.out.println("The sum of dgts: "+ sum);
        }
        
    
}