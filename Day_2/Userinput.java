import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // ----Integer------

        int a = sc.nextInt();
        System.out.println(a);
        
        // ----Float------
        float b = sc.nextFloat();
        System.out.println(b);
        
        String s = sc.nextLine();
        System.out.println(s);

        char c = sc.next().charAt(0);
        System.out.println(c); 
    }
}
