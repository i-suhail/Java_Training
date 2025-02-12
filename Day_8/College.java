package tamilnadu.chennai;

public class College {
    static String Clgname="DACE";
    int fees=200000;
    public static void main(String[] args) {
        College cg = new College();
        cg.display();
        cg.Studying();
}
        void display(){
            System.out.println("Welcome to "+Clgname+" college");
        }
        void Studying(){
            System.out.println("Students are sdtudying");
        }
        void recruit(){
            System.out.println("Companies are recruiting");
        }
        void write(){
            System.out.println();
        }
    }

