public class ThirdMinArr {
    public static void main(String[] args) {
        int arr[] = {4, 8, 3, 6, 1};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first<arr[i]) {
                third = second;
                second=first;
                first=arr[i];
            }
            else if (second<arr[i]) {
                third = second;
                second=arr[i]; 
            }
            else if (third<arr[i]) {
                third=arr[i];
            }
        }
        System.out.println("The First smallest number is : "+first+" \n"+"The second smallest number is : "+second+"\nThe Third smallest number is : "+third);
    }
}
