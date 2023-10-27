package lessons.lesson17.sorting.comparator;

import java.util.Comparator;

public class CarCompararorByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

       /*
        if (this.year == newCar.year) {
            return 0;
        } else if (this.year < newCar.year) {
            return -1;
        } else {
            return 1;
        }
        */
        return Integer.compare(o2.getYear(), o1.getYear());
    }
}
