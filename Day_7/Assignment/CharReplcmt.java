package Day_7.Assignment;

public class CharReplcmt {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb1 = new StringBuilder();
        int n = 3;

        for (int i = 0; i < str.length(); i++) {
            char newee = str.charAt(i);
            sb1.append(newee += 4);
        }
        System.out.println(sb1);
    }
}