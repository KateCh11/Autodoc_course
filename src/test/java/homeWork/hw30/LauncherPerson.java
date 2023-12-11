package homeWork.hw30;
/*
Создайте класс Person с полями name (строка) и age (целое число).
Создайте список объектов класса Person.
  new Person("Alice", 30),
  new Person("Bob", 22),
  new Person("Charlie", 28),
  new Person("David", 26)
Используя Stream API, выполните следующие задачи:
a. Отфильтруйте людей старше 25 лет.
b. Отсортируйте результат по имени в алфавитном порядке.
c. Преобразуйте каждый объект Person в строку в формате "Имя - Возраст".
d. Выведите полученные строки в консоль.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LauncherPerson {
    public static void main(String[] args) {
        /* //////--------Version1--------//////
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 22));
        personList.add(new Person("Charlie", 28));
        personList.add(new Person("David", 26));

        Stream<String> personStringStream = personList.stream()
                .filter(x -> x.getAge() > 25)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName() + " - " + person.getAge());
        personStringStream.forEach(System.out::println);
         */

        //////--------Version2--------//////

        Stream.of(
                        new Person("Alice", 30),
                        new Person("Bob", 22),
                        new Person("Charlie", 28),
                        new Person("David", 26)
                )
                .filter(x -> x.getAge() > 25)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName() + " - " + person.getAge())
                .forEach(System.out::println);
    }
}
