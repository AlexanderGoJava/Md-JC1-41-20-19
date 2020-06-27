//Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
package lesson_1;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers!");
        Scanner sc = new Scanner(System.in);
        System.out.print("First number, a: ");
        int a = sc.nextInt();
        System.out.print("Second number, b: ");
        int b = sc.nextInt();
        System.out.print("Third number, c: ");
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.println("The largest number is a, а = " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number b, b = " + b);
        } else {
            System.out.println("The largest number c, c = " + c);
        }
    }
}
