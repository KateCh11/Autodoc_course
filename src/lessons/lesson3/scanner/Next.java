package lessons.lesson3.scanner;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        System.out.println("Enter your data");//обрезает после пробела
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        System.out.println("Your First name and Second name" + data);
    }
}
