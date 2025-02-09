// Write a prog to print the grade of your marks

/*
100- 90 => A
75- 89 => B
50- 74 => C
50 < FAIL
*/

import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        int Marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your Marks:");

        Marks = sc.nextInt();

        if(Marks>=90 && Marks<=100){
            System.out.println("A Grade");
        }
        else if (Marks>75 && Marks<89) {
            System.out.println("B Grade");
        }
        else if(Marks>50 && Marks<74){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
} 