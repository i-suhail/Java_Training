package Day_8.Assignment;

public class ArmstrongMethod {
    public static void main(String[] args) {
        int num = 371;
        System.out.println(Armstrong(num));
    }
    static int Armstrong(int n){
        int count = 0;

        for (int i = n; i>0; i=i/10) {
            count++;
        }
        int rem, result=0;
        int temp=n;

        while(temp!=0){
            rem = temp%10;
            result = result + (int)Math.pow(rem, count);
            temp = temp/10;
        }
        if (result==n) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an Armstrong");
        } 
        return 0;
    }
}
