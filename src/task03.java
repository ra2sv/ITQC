import java.util.Scanner;

/*Задача 3
Написать программу, которая находит и выводит на экран максимальное из трех чисел.*/

public class task03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, max;
        try {
            System.out.print("Enter the first number: ");
            a = in.nextInt();
            System.out.print("Enter the second number: ");
            b = in.nextInt();
            System.out.print("Enter the third number: ");
            c = in.nextInt();

            if (a > b) {
                max = a;
            } else {
                if (b > c) {
                    max = b;
                } else {
                    max = c;
                }
            }
            if (a == b || a == c || b == c) System.out.print("You has entered numbers that are similar to each other. ");
            System.out.print("Largest of them: " + max);
        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }
    }
}
