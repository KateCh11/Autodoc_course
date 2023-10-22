package lessons.lesson14.exeption;

import java.util.Scanner;

public class ScannerExeptionExample {
    public static void main(String[] args) {

    }

    public static void example() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        /*
        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимый элемент массива");
        } catch (ArithmeticException a){
            System.out.println("Делить на 0 нельзя");
        }
        System.out.println("Программа продолжает свою работу");
    */
        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("что-то пошло не так");
        }

        System.out.println("Программа продолжает свою работу");

    }
}
