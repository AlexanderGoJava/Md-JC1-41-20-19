//Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
package lesson_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The number of digits in the entered number is equal to: " + getDivision(number));
        if (getPalindrome(number)) {
            System.out.printf("The number %d is a palindrome!", number);
        } else {
            System.out.printf("The number %d is not a palindrome!", number);
        }
    }

    //calculates how many times the number is divided by 10
    public static int getDivision(int number) {
        final byte multiplicator = 10;
        int counter = 0;
        while (number != 0) {
            number = number / multiplicator;
            counter++;
        }
        return counter;
    }

    //method determines if the number is a palindrome
    public static boolean getPalindrome(int number) {
        int j = getDivision(number);
        for (int i = 1; i <= j / 2; i++) {
            if ((number / (int) (Math.pow(10, j - i))) % 10 != (number / (int) (Math.pow(10, i - 1))) % 10) {
                return false;
            }
        }
        return true;
    }
}
