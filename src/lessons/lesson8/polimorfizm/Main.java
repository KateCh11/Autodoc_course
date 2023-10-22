package lessons.lesson8.polimorfizm;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(3.5,2.6));
        System.out.println(add(7));
        System.out.println(add("Kate", "Slava"));

    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a){
        return a+100;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static String add(String a, String b){
        return a+ " " + b;
    }

}
