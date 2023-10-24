package lessons.lesson17.sorting.comparator;

import java.util.TreeSet;

public class Launcher {
    public static void main(String[] args) {
        CarCompararorByYear carCompararorByYear = new CarCompararorByYear();
        TreeSet<Car> carTreeSet = new TreeSet<>(new CarCompararorByYear());
        carTreeSet.add(new Car("Volvo", 2005));
        carTreeSet.add(new Car("BMW", 2020));
        carTreeSet.add(new Car("Mercedes", 2016));
        carTreeSet.add(new Car("Opel", 2010));


        for (Car car : carTreeSet) {
            System.out.println(car);
        }

    }
}
