package Day_7;

public class StringBuildDemo {
    public static void main(String[] args) {
        String s ="Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append("World");
        s = sb.toString();
        System.out.println(s);
        StringBuilder sb1 = new StringBuilder("cat");
        sb1.reverse();
        System.out.println(sb1);
    }
}
