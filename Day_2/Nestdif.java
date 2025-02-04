public class Nestdif {
    public static void main(String[] args) {
        int a = 60;

        boolean hasTicket = true;
        if(hasTicket){
            if(a>60){
                System.out.println("Eligible for Test.");
            }
            else{
                System.out.println("Pay Fine then go for Test.");
            }
        }
        else{
            System.out.println("Not eligible for Test.");
        }
    }
}
