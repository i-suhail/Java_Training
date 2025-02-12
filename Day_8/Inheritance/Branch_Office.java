package tamilnadu.chennai;

public class Branch_Office extends Office {
    public Branch_Office(){
        System.out.println("Welcome to Branch Office.");
    }
    public static void main(String[] args) {
        Branch_Office bff = new Branch_Office();

        bff.work();
        bff.wfm();
        bff.recruit();
    }
    public void celebrate_local_func(){
        System.out.println("Celebrate");
    }
}
