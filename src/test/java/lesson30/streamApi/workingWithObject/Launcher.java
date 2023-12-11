package lesson30.streamApi.workingWithObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Launcher {
    public static void main(String[] args) {
        List<Car> carlist = new ArrayList<>();
        carlist.add(new Car("Tesla", 2020));
        carlist.add(new Car("Tesla", 2012));
        carlist.add(new Car("BMW", 2015));
        carlist.add(new Car("Honda", 2018));
        carlist.add(new Car("Subaru", 2000));

        Stream<Car> carStream = carlist.stream()
                .filter(x -> x.getYear() > 2012)
                .filter(x -> !"BMW".equalsIgnoreCase(x.getModel()));
        carStream.forEach(x-> System.out.println(x.getModel()));
    }
}
