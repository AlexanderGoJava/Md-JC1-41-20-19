//Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else).
package Lesson_1;

public class Task_8 {
    public static void main(String[] args) {
        String s1 = "Январь", s2 = "Февраль", s3 = "Март", s4 = "Апрель", s5 = "Май" , s6 = "Июнь",
                s7 = "Июль", s8 = "Август", s9 = "Сентябрь", s10 = "Октябрь", s11 = "Ноябрь", s12 = "Декабрь";
        int a = 12;
        for(int i = 1; i <= a; i++){
            if (i == 1) {System.out.println(s1);}
            else if (i == 2) {System.out.println(s2);}
            else if (i == 3) {System.out.println(s3);}
            else if (i == 4) {System.out.println(s4);}
            else if (i == 5) {System.out.println(s5);}
            else if (i == 6) {System.out.println(s6);}
            else if (i == 7) {System.out.println(s7);}
            else if (i == 8) {System.out.println(s8);}
            else if (i == 9) {System.out.println(s9);}
            else if (i == 10) {System.out.println(s10);}
            else if (i == 11) {System.out.println(s11);}
            else {System.out.println(s12);}
        }
    }
}
