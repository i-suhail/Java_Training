package Day_8;

public class SuperMarket {
    // Non-Static or Global or Fields
    static String name = "Reliance Mall"; 
    String pname;
    int price;
    int discount;
    SuperMarket(){
        System.out.println("Welcome to the Market.");
    }
    SuperMarket(String p, int p1, int d){
        // pname = p;
        // price = p1;
        // discount = d;0
        this.pname = pname;
        this.price = price;
        this.discount = discount;
        product1.display();
    }

    public static void main(String[] args) {
        // int a=20;
        SuperMarket product = new SuperMarket();
        SuperMarket product1 = new SuperMarket("rice", 50, 10);
        // product1.pname="rice";
        // product1.price=50;
        // product1.discount=5;
        System.out.println(product1.pname);

        SuperMarket product2 = new SuperMarket("biscuits", 20, 5);
        // product2.pname = "biscuit";
        // product2.price = 10;
        // product2.discount = 2;
        System.out.println(product2.pname);

        System.out.println(name);
    }
    void display(){
        System.out.println(this.pname);
        System.out.println(name);
    }
}

