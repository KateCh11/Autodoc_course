package lessons.lesson14.innnerClasses.anonymous;

public class OuterCarStatic {

    static class Inner_Engine {
        public void startEngine() {
            System.out.println("Start Engine");
        }
    }

    static class Inner_Electric {
        public void turnOnIgnition() {
            System.out.println("Turning on ignition");
        }
    }
}
