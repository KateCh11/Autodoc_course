package homeworks.hw11Calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        System.out.println(calc(num1, num2, operation));
    }

    //Метод int getInt() - должен считывать с консоли целое число и возвращать его
    public static int getInt() {
        System.out.println("Enter any integer number");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("You entered wrong number. Enter one more time.");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    //Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ
    // с операцией (+, -, * или /)
    public static char getOperation() {
        System.out.println("Enter operation: + - * /");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You entered wrong operation. Enter one more time.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    //Метод int calc(int num1, int num2, char operation) -
    // должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation is wrong. Try one more time");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

/*
System.out.println("Addition= " + (num1 + num2));
System.out.println("Subtraction= " + (num1 - num2));
System.out.println("Multiplication= " + (num1 * num2));
System.out.println("Division= " + (num1 / num2));
*/

