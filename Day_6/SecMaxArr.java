public class SecMaxArr {
    public static void main(String[] args) {
        int arr[] = {4, 8, 3, 6, 1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first<arr[i]) {
                second=first;
                first=arr[i];
            }
            else if (second<arr[i]) {
                second=arr[i];
            }
        }
        System.out.println("The First smallest number is : "+first+" \n"+"The second smallest number is : "+second);
    }
}
