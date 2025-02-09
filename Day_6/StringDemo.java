public class StringDemo {
    public static void main(String[] args) {
        // String str = "Hello_World";
        // Creating through an object...
        // String str2 = new String("HelloWorld");
        
        // Non-Static Method => ".length();"
        //Immutable = can't Altered, Edit,   

        // for (int i = 0; i < str.length(); i++) {
        //     System.out.print((str).charAt(i));
        // }
        String str = "Hello";
        String str1 = new String("Hello");

        System.out.println(str==str1?"same":"not same");
    }    
}
