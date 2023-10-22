package lessons.lesson6;

public class ClassRoundExample {
    public static void main(String[] args) {
        double num = 22.33;

        System.out.println(Math.round(num));//22 до ближайшего целого числа - возвр int
        System.out.println(Math.ceil(num));//23.0 до ближайшего целого вверх. Double
        System.out.println(Math.floor(num));//22.0 до ближайшего целого вниз. Double


        int a = (int) Math.floor(num);
        System.out.println(a);
    }
}
