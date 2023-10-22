package homeworks.hw6;

import java.util.Scanner;

public class Lessons {
    public static void main(String[] args) {
        homeWorkLessons();
    }

    public static void homeWorkLessons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter county of lessons more than 0");
        int kol = scanner.nextInt();

        if (kol <= 0) {
            System.out.println("You entered invalid number of lessons");
        } else {

            for (int i = 1; i <= kol; i++) {
                if (i < kol) {
                    System.out.println("Это " + i + "-й урок!");
                    System.out.println("Я выполнил все домашние задания " + i + "-го урока.");
                    System.out.println();
                } else if (i == kol) {
                    System.out.println("Это " + i + "-й урок!");
                    System.out.println("Я не выполнил домашние задания " + i + "-го урока.");
                }
            }
        }
    }
}
