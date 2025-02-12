package Day_7;

public class Demo {
    {
        System.out.println("ohh!Hii, from non static");    
    }{
        System.out.println("ohh!Hii, from non static-block-2");    
    } //it will execute only when the object is created.
    static {
        System.out.println("Hi World from static");
    }
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
