package lessons.lesson9.override.incapsulation.launch;

import lessons.lesson9.override.incapsulation.cars.Bmw;
import lessons.lesson9.override.incapsulation.cars.Honda;
import lessons.lesson9.override.incapsulation.cars.Opel;
import lessons.lesson9.override.incapsulation.cars.Shkoda;

public class Main {
    public static void main(String[] args) {
       /* Bmw bmw = new Bmw();
        bmw.aboutCar();
        System.out.println(bmw.fuel);

        Honda honda = new Honda();
        honda.publicAboutCar();*/

        //это когда мы пользуемся геттерами и сеттерами
      /*  Shkoda shkoda = new Shkoda();
        //shkoda.showAllInfo();
        String model = shkoda.getModel();
        System.out.println(model);
        */




        //тут мы пользуемся сеттерами
        Opel opel = new Opel();
        opel.setFuel("diesel");
        opel.setModel("Astra");
        opel.showAllInfo();

        //тут мы пользуемся геттерами
        System.out.println(opel.getFuel() + "it is fuel");
        opel.showAllInfo();

        Opel opel1 = new Opel();
        opel1.showAllInfo();

    }
}
