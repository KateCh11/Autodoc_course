package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        /*
        System.out.println("Enter your First name and Second name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your First name and Second name" + name);*/

        System.out.println("Enter your First name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Enter your Second name");
        //Scanner scanner = new Scanner(System.in);
        String secondName = scanner.nextLine();

        System.out.println("Your First name and Second name: " + name + " " + secondName);
    }
}
