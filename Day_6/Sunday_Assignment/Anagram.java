
// ---------------------------ONLY PRACTICE CODE NOT FOR USE-----------------------
package Sunday_Assignment;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        String s1 = "Tab"; 
        String s2 = "Bat";
        int sl1 = s1.length();
        int sl2 = s2.length();
        

        boolean isSame=false;
        for (int i = 0; i < sl1; i++) {
            for (int j = 0; j < sl2; j++) {
                if (s1.charAt(i)==s2.charAt(j)) {
                    isSame=true;
                }
                else{
                    isSame=false;
                }
            }
        }
        if (isSame==true && sl1==sl2) {
            System.out.println("Anagram");
        }
    }
}
