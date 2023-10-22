package lessons.lesson9.override.incapsulation.cars;

public class Launcher {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.aboutCar();
        System.out.println(honda.fuel);
    }
}
