package lessons.lesson14.exeption;

public class UncheckedExample {
    public static void main(String[] args) {

    }

    public static void divisionOnNUll(){
        try
        {
            int a = 4;
            System.out.println(a/0);
        } catch (ArithmeticException e){
            System.err.println("На ноль делить нельзя");
        }
        System.out.println("Программа продолжает работу");
    }
}
