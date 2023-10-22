package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextDouble {
    public static void main(String[] args) {
        System.out.println("Enter any double number (e.g. 1,4)");
        Scanner scanner = new Scanner(System.in);
        double someDouble = scanner.nextDouble();
        System.out.println("Your entered: " + someDouble);
    }
}
