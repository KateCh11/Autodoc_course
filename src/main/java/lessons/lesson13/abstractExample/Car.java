package lessons.lesson13.abstractExample;

abstract class Car {

    public Car(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    private String typeFuel;

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    /*void getFuel(String typeFuel){
        System.out.println(typeFuel);
    }*/

    void getFuel(){
        System.out.println(this.typeFuel);
    }
}
