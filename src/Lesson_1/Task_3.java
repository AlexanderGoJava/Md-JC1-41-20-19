//Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
package Lesson_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Количество цифр во введённом числе равно: " + getDivision(number));
        if (getPalindrome(number)) {
            System.out.printf("Число %d является палиндромом!", number);
        }
        else {
            System.out.printf("Число %d не является палиндромом!", number);
        }
    }

    public static int getDivision(int number) {
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }

    public static boolean getPalindrome(int number) {
        int j = getDivision(number);
        for (int i = 1; i <= j / 2; i++) {
            if ((number / (int)(Math.pow(10, j-i))) % 10 != (number / (int)(Math.pow(10, i - 1))) % 10) {
                return false;
                }
            }
        return true;
    }
}
