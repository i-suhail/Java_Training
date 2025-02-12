package Day_8;

public class OopsDemo {
    public static void main(String[] args) {
        OopsDemo obj = new OopsDemo();
        int a=5, b=6;
        obj.add(a,b);
        sub(a,b);
        int result = mul(a,b);
        float res = div(result);
        System.out.println(res+1);
    }
    void add(int c, int d){
        System.out.println(c+d);
    }
    static void sub(int e, int f){
        System.out.println(e-f);
    }
    static int mul(int q, int r){
        System.out.println("Multiplicatin:");
        return q*r;
    }
    static float div(int r){
        return r/5;
    }
}
