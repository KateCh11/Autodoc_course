package lessons.lesson12.finalExample;

public class SomeClass extends ClassFinal {

    @Override
    public void sayAge() {
        super.sayAge();
    }

    public void aboutPerson() {
        sayAge();
        sayHello();
    }
}
