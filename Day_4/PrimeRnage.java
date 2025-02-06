public class PrimeRnage {
    public static void main(String[] args) {
        
        for (int i = 2; i <=25; i++) {
            int div=2;
            boolean isPrime = true;

            while (div<=i/2) {
                if(i%div==0){
                    isPrime = false;
                    break;
                }    
                div++;
                
            }
            
            // for (int j = 0; j < i/2; j++) {
                
            // }
            System.out.print(isPrime ? i + " " : "");
        }
    }
    
}