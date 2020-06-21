/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
  В классе создать 2 метода, статический и не статический. Один из методов решает по весу машины ее тип:
  легковой, джип, грузовой (через свитч). Второй метод генерирует рандомную машину.*/
package Lesson_3;

import Lesson_3.domain.Car;
import Lesson_3.util.CarUtil;

public class Task_1 {
    public static void main(String[] args) {

        Car car1 = CarUtil.generateCar();
        Car car2 = CarUtil.generate();

        System.out.println(car1);
        System.out.println(car2);
    }
}

