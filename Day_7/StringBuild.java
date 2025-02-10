package Day_7;

public class StringBuild {
   public static void main(String[] args) {
    
    StringBuilder str = new StringBuilder("abc");
    StringBuilder str2 = new StringBuilder("abc");
    
    // StringBuilder stb1= "abc"---->> NOT A VALID WAY
    str.append("hello");
    System.out.println(str==str2);
    System.out.println(str.equals(str2));
    System.out.println();

    String s1 = "abcd";
    String s2 = s1;
    s2 = "pqr";
    System.out.println(s1==s2);



   } 
}
