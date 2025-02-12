package tamilnadu.chennai;

public class Office {
    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        off.do_plan();
    }
    void work(){
        System.out.println("Working");
    }
    void wfh(){
        System.out.println("Working From Home");
    }
    void recruit(){
        System.out.println("Recruitment");
    }
    void get_travel_allowances(){
        System.out.println("got money");
    }
    private void do_plan(){
        System.out.println("Planning");
    } 
}