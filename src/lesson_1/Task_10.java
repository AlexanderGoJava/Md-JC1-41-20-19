//Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
package lesson_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers!");
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        sc.close();
        int c = a + b;
        System.out.println("The sum of two integers is: " + c);
    }
}
