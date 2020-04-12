import java.util.Scanner;

/*Задача 5
Вывести на экран числа от 5 до 1.*/

public class task05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the number from 1 to max to which you want to display: ");
            int a = in.nextInt();
            if (a < 1) {
                System.out.print("Number should be more than 1");
            } else{
                while (a > 0) {
                    System.out.println(a);
                    a--;
                }
            }
        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }
    }
}
