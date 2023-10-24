package lessons.lesson17.sorting.comparable;

public class Car implements Comparable<Car> {

    private String model;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car newCar) {
        if (this.year == newCar.year) {
            return 0;
        } else if (this.year < newCar.year) {
            return -1;
        } else {
            return 1;
        }

        //return this.model.compareTo(newCar.model);
    }
}
