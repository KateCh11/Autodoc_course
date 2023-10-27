package lessons.lesson3.scanner;

public class TypeConversion {
    public static void main(String[] args) {
        implicit();
        explicit();
        doubleToInt();

    }

    public static void implicit(){
        //неявное из большего в меньшее
        byte a = 15;
        int b = a;
        System.out.println(b);
    }

    public static void explicit(){
        //явное
        int a = 5;
        byte b = (byte)a;
        System.out.println(b);
    }

    public static void doubleToInt(){
        double a = 128.33;
        int b = (int)a;
        System.out.println(b);
    }
}
