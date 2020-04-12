import java.util.Arrays;
import java.util.Scanner;

/*Задача 6
Напишите программу, которая выводит на экран сумму всех чисел массива.*/

public class task07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the array length: ");
            int a = in.nextInt();
            int m = a - (a-1);
            int sum = 0;

            int[] array = new int[a];
            for (int i = 0; i < array.length; i++) {
                array[i] = m;
                m++;
            }
            System.out.println("Array with length " + a + " was created: " + Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                sum = array[i] + sum;
            }
            System.out.println("The sum of all elements of the array is equal: " + sum);

        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }
    }
}