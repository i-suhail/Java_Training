package Day_7;

public class StrinEql {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = s1;
        System.out.println(s1==s2?"same":"not same");

        // String s1 = new String("ABC");
        // String s2 = new String("ABCD");
        // s1 += "D";
        // System.out.println(s1==s2?"same":"not same");

        String s3 = new String("PQR");
        String s4 = s3;
        s3 = "XYZ";
        System.out.println(s3==s4?"same":"not same");

        String s5 = new String("SUH");
        String s6 = s5;
        s5 = "ILZ";
        s6 = "ILZ";
        System.out.println(s5==s6?"same":"not same");

        String s7 = new String("ofg");
        String s9 = new String(s7);
        System.out.println(s7==s9?"same":"not same");

    }
}
