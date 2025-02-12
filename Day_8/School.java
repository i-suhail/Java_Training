package Day_8;

public class School {
    static String name = "ABC School";
    int fees; //it is not static, related to the objects...
    public static void main(String[] args) {
        School admission = new School();
        admission.teaching();
        System.out.println(name);
    }
    void teaching(){
        System.out.println("Teacher is teaching.");
    }
}
