import java.util.Scanner;

/*Задача 4
Написать программу, которая проверяет, является ли число четным или нечетным.*/

public class task04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            if (a%2 == 0) {
                System.out.print("Number " + a +" is even");
            } else {
                System.out.print("Number " + a +" is odd");
            }
        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }

    }
}
