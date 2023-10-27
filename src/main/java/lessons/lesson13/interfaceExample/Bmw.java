package lessons.lesson13.interfaceExample;

public class Bmw implements iCar, iParts {
    @Override
    public String maxSpeed() {
        return "180";
    }

    @Override
    public void drive() {
        System.out.println("Bmw drive");
    }

    @Override
    public void brake() {
        System.out.println("Bmw brake");
    }

    @Override
    public int choosePart(int number) {
        return 123456;
    }
}
