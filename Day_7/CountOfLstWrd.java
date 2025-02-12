package Day_7;

public class CountOfLstWrd {
    public static void main(String[] args) {
        String s = "This is last index";
        String Trimmed = s.trim();
        int lstIndex = s.lastIndexOf(" ");
        int len = Trimmed.length()-lstIndex;
        System.out.println(len-1);
        
    }
}
