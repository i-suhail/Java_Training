package Day_9;

public class Child extends Parent {
// -----------------OVERRIDDING ---------------------

    public static void main(String[] args) {
        Child obj = new Child();
        obj.study();
        obj.job();
        obj.watching();
    }
    public void study(){
        System.out.println("Studying java Progranmming...");
    }
    void job(){
        System.out.println("Working as serviceNow Developer");
    }
    
}
