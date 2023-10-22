package lessons.lesson7;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        //randomDefault();
        //randomCustom();
        //randomCustom2();
        randomCustom3();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //String str = new Scanner (System.in).nextLine();

        //IntStream a =
    }

    public static void randomCustom3(){
        //(Math.random() * (b-a)) + a;
        //[0;3) (Math.random() * (3-2)) + 2
        //[0;2]
        int a = (int) (Math.random() * 3);
        System.out.println(a);
    }

    public static void randomCustom2(){
        //(Math.random() * (b-a)) + a;
        //[2;3) (Math.random() * (3-2)) + 2
        double a = Math.random() + 2;
        System.out.println(a);
    }

    public static void randomCustom(){
        //(Math.random() * (b-a)) + a;
        //[0;3) (Math.random() * (3-0)) + 3
        double a = Math.random() *3;
        System.out.println(a);
    }

    public static void randomDefault(){
        double a = Math.random();
        System.out.println(a);
    }
}
