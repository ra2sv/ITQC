import java.util.Arrays;
import java.util.Scanner;

/*Задача 6
Напишите программу, которая выводит на экран сумму всех чисел массива.*/

public class task08Star {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean proceed = true;
        try {
            do {
                System.out.print("Enter the first number: ");
                double a = in.nextInt();

                System.out.println("Available action:");
                System.out.println("1. Summarize");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.print("Select the action: ");
                int action = in.nextInt();

                if (action >= 1 && action <= 4) {
                    System.out.print("Enter the second number: ");
                    double b = in.nextInt();
                    proceed = true;
                    if (action == 1) {
                        System.out.println("Sum " + a + " + " + b + " = " + (a + b));
                    } else if (action == 2) {
                        System.out.println("Subtract " + a + " - " + b + " = " + (a - b));
                    } else if (action == 3) {
                        System.out.println("Multiply " + a + " * " + b + " = " + (a * b));
                    } else if (action == 4) {
                        if (b == 0) {
                            System.out.println("Can not be divided by zero");
                            proceed = false;
                        } else {
                            System.out.println("Multiply " + a + " / " + b + " = " + (a / b));
                        }
                    }
                } else {
                    System.out.println("You should select one of available actions");
                    proceed = false;
                }
            } while (proceed == false);
        } catch (Exception e) {
            System.out.print("Please enter a valid number (double allowed)");
        }
    }
}