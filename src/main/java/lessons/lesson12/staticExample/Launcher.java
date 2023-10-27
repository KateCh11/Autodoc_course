package lessons.lesson12.staticExample;

import java.sql.SQLOutput;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(StaticForFields.name);
        System.out.println(new StaticForFields().age);
    }
}
