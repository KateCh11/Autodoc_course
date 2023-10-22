package lessons.lesson13.abstractExample;

public class Nissan extends Car{

    public Nissan(String typeFuel) {
        super(typeFuel);
    }

    @Override
    String maxSpeed() {
        return "150";
    }

    @Override
    void drive() {
        System.out.println("Nissan drive");
    }

    @Override
    void brake() {
        System.out.println("Nissan brake");
    }
}
