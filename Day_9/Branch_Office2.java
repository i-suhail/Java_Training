package tamilnadu.kerala;
import tamilnadu.kallakurichi.Branch_Office1;

public class Branch_Office2 extends Branch_Office1{
    Branch_Office2(){
        System.out.println("Welcome to Kerala....");
    }
    public static void main(String[] args) {
        Branch_Office2 bff2 = new Branch_Office2();
        bff2.promoted();
        bff2.wfh();
        bff2.recruit();
    }
    void promoted(){
        System.out.println("Got Promotion");
    }
}
