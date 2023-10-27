package lessons.lesson14.innnerClasses.anonymous;

public class Launcher {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String helloMessage() {
                return null;
            }
        });
    }
}
