package lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        switchCondition();
    }
    public static void switchCondition(){
        System.out.println("Enter number 1 or 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("You entered NOT 1 or 2 or 3");
        }
    }

}
