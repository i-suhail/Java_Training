package Day_8;

public class MethodDemo {
    public static void main(String[] args) {

        // ----------Method OverLoading same Method with different parameters
        /*
            with parameter with return
            with parameter without return
            without parameter with return
            without parater without return
         */



        int a=2, b=3, c=5;
        add(a,b);
        add(a,b,c); // arguments: Actual values
    }
    // Parameyers: Local Variables
    static void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    static void add(int a, int b){
        System.out.println(a+b);
    }
}
