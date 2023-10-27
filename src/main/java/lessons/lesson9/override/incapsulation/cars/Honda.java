package lessons.lesson9.override.incapsulation.cars;

public class Honda {
    String fuel = "Petrol";

    void aboutCar(){
        System.out.println("It is Honda");
    }

    public void publicAboutCar(){
        System.out.println("It is public BMW");
    }
}
