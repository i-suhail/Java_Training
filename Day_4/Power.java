public class Power {
    public static void main(String[] args) {       
        int base = 31;
        int power = 3;
        int num = 1;

        for (int i = 1; i <= power; i++) {
            num *= base;
        }

        System.out.println(num);

    }
}
