package Day_5;

public class Pattern5 {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int space= n-i; 
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}