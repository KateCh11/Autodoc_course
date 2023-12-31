package lessons.lesson17.sorting.comparator;

public class Car {

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


}
