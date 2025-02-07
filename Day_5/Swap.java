package Day_5;

public class Swap {
    public static void main(String[] args) {
        int a=5, b=7;
        // int temp;
        System.out.println(a+" "+b);
        // temp = a;
        // a=b;
        // b=temp;

        a = a+b; //12
        b = a-b; //5
        a = a-b; //7

        
        System.out.println(a+" "+b);
    }
}
