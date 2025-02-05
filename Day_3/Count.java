import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        // for(int i=1; i<60; i++){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enetr a number: ");
        int n = sc.nextInt();
        int count= 1;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
