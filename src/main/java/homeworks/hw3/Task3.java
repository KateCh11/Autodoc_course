package homeworks.hw3;

import java.util.Scanner;

/*Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 и в том случаи,
если пользователь ввёл какое-либо другое число программа должна отвечать
„Вы ввели число не равное 1, 2 или 3“ */


public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number 1 or 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("You entered 1");
        } else if (number == 2) {
            System.out.println("You entered 2");
        } else if (number == 3) {
            System.out.println("You entered 3");
        } else {
            System.out.println("You entered NOT 1 or 2 or 3");
        }
    }


}
