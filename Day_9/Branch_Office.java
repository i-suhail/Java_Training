package tamilnadu.chennai;

public class Branch_Office extends Office{
    public Branch_Office(){ //pakage privte if not given acess modifier...
        System.out.println("Welcome to Branch_Office");
    }
    public static void main(String[] args) {
        Branch_Office bff = new Branch_Office();
        bff.celebrate_local_function();
        bff.work();
    }
    void celebrate_local_function(){
        System.out.println("Celebrating");
    }
}
