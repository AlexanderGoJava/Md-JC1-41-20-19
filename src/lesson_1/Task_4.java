//Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления).
package lesson_1;

public class Task_4 {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " | "); //вывод в строку для удобства чтения чисел.
            }
        }
    }
}
