package lessons.lesson5;

import java.util.Scanner;

public class UserMethods {
    public static void main(String[] args) {
        sayHello();
        getStrAndPrint("Hello my dear friend");
        System.out.println(sum(2, 2));
        int res = sum(3,5);
        System.out.println(res);
        String aboutYou = getNameAndSurname("Kate", "Cheliadina", 35);
        System.out.println(aboutYou);
        sumFromConsole();

        int sumOfOrders = 100;
        int finalSum = returnSumFromConsole() + sumOfOrders;
        System.out.println(finalSum);
    }

    public static int returnSumFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }

    public static void sumFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }

    public static String getNameAndSurname(String name, String Surname, int age){
        return name + " " + Surname + " " + age;
    }

    public static int sum(int a, int b){
        //int result = a + b;
        //return result;
        return a+b;
    }

    public static void getStrAndPrint(String str){
        System.out.println("You enter: " + str);
    }
    public static void sayHello(){
        System.out.println("Hello");
    }



}
