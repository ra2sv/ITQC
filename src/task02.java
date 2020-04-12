import java.util.Scanner;

/*Задача 2
Написать программу, которая выводит на экран разницу двух чисел.*/

public class task02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the first number: ");
            a = in.nextInt();
            System.out.print("Enter the second number: ");
            b = in.nextInt();
            System.out.print("Difference of two numbers: " + (a - b));
        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }

    }
}
