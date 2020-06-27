//Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for).
package lesson_1;

public class Task_6 {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 2; i < a; i += 2) {
            System.out.print(i + " | ");
        }
    }
}
