package lessons.lesson13.abstractExample;

public class Launcher {
    public static void main(String[] args) {

        Car toyota = new Toyota("Diesel");
        aboutCar(toyota);
        toyota.getFuel();

        Car bmw = new Bmw();
        aboutCar(bmw);

        Car nissan = new Nissan("Gas");
        aboutCar(nissan);

    }

    static void aboutCar(Car car){
        System.out.println("Max скорость автомобиля" + car.maxSpeed());
        car.drive();
        car.brake();
    }

}
