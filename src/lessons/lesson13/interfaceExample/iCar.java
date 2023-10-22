package lessons.lesson13.interfaceExample;

public interface iCar extends iParts, iOther{

    String OTHER_TYPE_FUEL = "Diesel";

    String maxSpeed();

    void drive();

    void brake();

    default void getFuel(String typeFuel) {
        System.out.println(typeFuel);
    }

    private void utilMethod() {
        //method only for interface use
    }
}
