package tamilnadu.chennai;

public class Office {
    final int salary=45000;
    public Office(){
        System.out.println("the main office");
    }
    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        // off.salary=50000; //Not possible to change final.
    }
    public void work(){
        System.out.println("Working at office");
    }
    void recruit(){
        System.out.println("Recruitment");
    }
    protected void wfm(){
        System.out.println("Working from home");
    } 
    private void do_business_plan(){
        System.out.println("");
    } 
}
