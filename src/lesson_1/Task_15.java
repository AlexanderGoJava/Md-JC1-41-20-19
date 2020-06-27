//Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе): for / while / do while.
package lesson_1;

public class Task_15 {
    public static void main(String[] args) {
        int a = 100, i, j = 1, k = 1;
        System.out.println("First cycle, for:");
        for (i = 1; i < a; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(i + ".");
        System.out.println("Second cycle, while:");
        while (j != 100) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println(j + ".");
        System.out.println("Third cycle, do while:");
        do {
            System.out.print(k + ", ");
            k++;
        } while (k != 100);
        System.out.println(k + ".");
    }
}
