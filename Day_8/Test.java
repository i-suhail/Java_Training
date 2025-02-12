package Day_8;

public class Test {
    static String a ="Hello";
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
        Test t1 = new Test();
        t1.display1();
    }
    void display(){
        a="Boy";
    }
    void display1(){
        System.out.println(a);
    }
}
