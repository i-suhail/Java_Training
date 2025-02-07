package Day_5;

public class PrintArrayIndices {
    public static void main(String[] args) {
        int a[]= {2,8,6,4,10};

        int sum=0;

        for(int i=0; i<a.length; i++){
            if (i%2==0) {
                System.out.println(a[i]);
            }
        }        
    }
}