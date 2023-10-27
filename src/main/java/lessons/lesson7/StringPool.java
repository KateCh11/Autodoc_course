package lessons.lesson7;

public class StringPool {
    public static void main(String[] args) {
        String name = "Alex"; // это запись через литерал
        String name2 = "Alex";

        String name3 = new String("Alex");
        String name4 = new String("Alex");

        String name5 = new String("Alex").intern();
        String name6 = new String("Alex").intern();

        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name5 == name6);

        String str = "Hello world!".toUpperCase().concat("Alex");
    }
}
