package lessons.lesson8.oop.common;

public class Person {
    int year = 1989;
    String name = "Alex";

    public void sayHello(){
        System.out.println("Say hello");
    }

    public void aboutPerson(){
        System.out.println("Person name " + name + "Birth year " + year);
    }
}
