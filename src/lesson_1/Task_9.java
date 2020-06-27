//Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.
package lesson_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers!");
        Scanner sc = new Scanner(System.in);
        System.out.print("First number, a: ");
        int a = sc.nextInt();
        System.out.print("Second number, b: ");
        int b = sc.nextInt();
        sc.close();
        a = a + b - (b = a);
        System.out.print("Swap Numbers: a = " + a + " | b = " + b);
    }
}
