package homeworks.hw3;

import java.util.Scanner;

/*Пользователю должно быть предложенно ввести два целых числа. Далее должно быть предложенно ввести в консоль имя.
В переменную result записать сумму двух введенных чисел.
Ответ должен быть: Имя result.*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Enter your Name:");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        int result = number1 + number2;
        System.out.println(name + ": " + result);

    }
}
