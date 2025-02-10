package Day_7;

public class StringEql2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2?"same":"not same");

        String s3 = "abc";
        String s4 = "abcd";
        s3 += "d";
        System.out.println(s3==s4);
    }
}
