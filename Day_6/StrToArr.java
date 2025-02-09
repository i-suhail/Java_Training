import java.util.Arrays;

public class StrToArr {
    public static void main(String[] args) {
        String str = "Hello";
        char c[] = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        String s1 = new String(c);
        System.out.println(s1);
        System.out.println(Arrays.toString(c));
    }
}
