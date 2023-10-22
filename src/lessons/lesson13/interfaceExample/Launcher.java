package lessons.lesson13.interfaceExample;

//import lessons.lesson13.abstractExample.Car;
import lessons.lesson13.interfaceExample.iCar;

import static lessons.lesson13.interfaceExample.iCar.OTHER_TYPE_FUEL;

public class Launcher {
    public static void main(String[] args) {
        iCar bmw = new Bmw();
        aboutCar(bmw);
        bmw.getFuel(OTHER_TYPE_FUEL);
        bmw.partsPrice(23);//это возможно, т.к. мы наследовали в iCar extends iParts
        bmw.otherMethodMethod();

        /*iParts bmwParts = new Bmw();
        bmwParts.partsPrice(23);*/
        //bmw.partsPrice(23);
    }

    static void aboutCar(iCar car){
        System.out.println("Max скорость автомобиля" + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
