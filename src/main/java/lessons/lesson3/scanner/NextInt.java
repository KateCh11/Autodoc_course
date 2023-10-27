package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        System.out.println("Enter any number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You entered " + number);

        System.out.println("--------------------");
        System.out.println("Enter any two numbers from 1 to 10");
        //Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("sum " + (number1 + number2));
    }
}
