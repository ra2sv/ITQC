import java.util.Scanner;

/*Задача 6
Вывести на экран таблицу умножения на 7.
Пример вывода на экран:
7 * 1 = 7
7 * 2 = 14
и т.д.*/

public class task06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int a = in.nextInt();
            System.out.print("Enter the Multiplier: ");
            int b = in.nextInt();
            if (b <= 0) {
                System.out.print("Multiplier should be more than 0");
            } else{
                int m = b-(b-1);
                for (int i = 1; i <= b; i++) {
                    System.out.println(a + " * " + m + " = " + (a*m));
                    m++;
                }
            }
        } catch (Exception e) {
            System.out.print("Please enter a valid number (int)");
        }
    }
}
