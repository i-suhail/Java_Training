package tamilnadu.kallakurichi;
import tamilnadu.chennai.Branch_Office;

public class Branch_Office1 extends Branch_Office{
    public Branch_Office1(){
        System.out.println("Welcome to Kallakurichi Branch_Office");
    }
    public static void main(String[] args) {
        Branch_Office1 bff1 = new Branch_Office1();
        bff1.hike();
        bff1.wfh();
        // bff1.work();
    }
    void hike(){
        System.out.println("got hike");
    }
}
