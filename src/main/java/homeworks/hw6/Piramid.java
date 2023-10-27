package homeworks.hw6;

import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        printPiramid();
    }

    public static void printPiramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter county of line");
        int rowNum = scanner.nextInt();
        for (int i = 1; i <= rowNum; i++) {
            printAsterisks(i, rowNum);
        }
    }

    public static void printAsterisks(int amount, int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            if (i <= rowNum - amount) {
                System.out.print(" ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}
