public class PrintVowels {
    public static void main(String[] args) {
        String word = "Hello World";
        word = word.toLowerCase();
        
        // String vowels[] = {"a","e","i","o","u"};
        // for (int i = 0; i < word.length(); i++) {
        //   if (word.equals(vowels)) {
        //     System.out.println(i);
        //   }  
        // }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
                System.out.println(word.charAt(i));
            }   
        }
    }
}
