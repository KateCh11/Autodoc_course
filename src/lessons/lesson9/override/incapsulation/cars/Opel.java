package lessons.lesson9.override.incapsulation.cars;

public class Opel {

    private String fuel = "testFuel";
    private String model = "testModel";

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setModel(String fuel) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public String getModel() {
        return model;
    }

    private void showModel() {
        System.out.println("Our model = " + this.model);
    }


    public void showAllInfo() {
        System.out.println("Fuel of Shkoda = " + fuel + " Our model = " + model);
    }
}
