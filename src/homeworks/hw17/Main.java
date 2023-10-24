package homeworks.hw17;

import java.util.ArrayList;
import java.util.List;

/*
Задание: Сортировка студентов по среднему баллу

Цель задания: Написать Java программу, которая позволяет управлять списком студентов и сортировать их по среднему баллу.

Требования:
* 		Создайте класс Student, который должен содержать следующие поля:
* name (имя студента, строковое значение).
* averageGrade (средний балл студента, числовое значение).
* 		Создайте класс Main, который будет содержать метод main для запуска программы.
* 		В классе Main создайте список (коллекцию) студентов, используя ArrayList<Student>. Минимум 5 студентов!
* 		Реализуйте сортировку студентов в списке по среднему баллу в убывающем порядке (от самого высокого балла к самому низкому).
* 		Выведите на экран отсортированный список студентов после сортировки.
*/

public class Main {

    public static void main(String[] args) {

        StudentComparator studentComparator = new StudentComparator();
        List<Student> studentsList = new ArrayList<>();

        //List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Tom", 4));
        studentsList.add(new Student("Timoti", 4));
        studentsList.add(new Student("Mikaela", 3));
        studentsList.add(new Student("Anna", 5));
        studentsList.add(new Student("Jack", 4));
        studentsList.add(new Student("Izabella", 3));

        studentsList.sort(studentComparator);
        System.out.println(studentsList);

    }
}
