package lessons.lesson14.initialblocks;

public class StaticExample {
    static  String name;

    static {
        System.out.println("Here");
        name ="Alex";
        age =34;
        isWork =true;
    }

    public StaticExample(String name, int age, boolean isWork) {
        this.name = name;
        this.age = age;
        this.isWork = isWork;
    }

    public StaticExample() {
    }

    static int age;
    static boolean isWork;
}
