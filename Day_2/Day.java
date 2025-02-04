// Wrtite a program
/*
    To get the user input from 1 - 7 & print the Day acc to num by using Switch & Case
*/

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int days=0;
        System.out.println("Enter the Day Number: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31;
                     break;
            case 2: 
                System.out.println("Enter the Year:");
                int year = sc.nextInt();
                if(year%4==0 && year%100!=0|| year % 400 == 0){
                    days = 29;
                }else{
                    days = 28;
                }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days=30;
                    break;
                default:
                    System.out.println("Invalid Month");
                    break;
        }
    }
}