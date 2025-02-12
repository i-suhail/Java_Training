package tamilnadu.chennai;

public class Office {
    public Office(){
        System.out.println("Welcome To Office...");
    }
    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        off.do_plan();
    }
    void work(){ //package private
        System.out.println("Working");
    }
    public void wfh(){
        System.out.println("Working From Home");
    }
    public void recruit(){
        System.out.println("Recruitment");
    }
    void get_travel_allowances(){
        System.out.println("got money");
    }
    private void do_plan(){
        System.out.println("Planning");
    } 
}