package lessons.lesson9.override.incapsulation.cars;

public class Shkoda {

    private String fuel = "diesel";
    private String model = "Oktavia";

    public String getModel(){
        return this.model;
    }

    private void aboutCar(){
        System.out.println("It is Tesla");
    }

    private void showModel(){
        System.out.println(this.model);
    }

    public void showAllInfo(){
        System.out.println("Fuel of Shkoda " + fuel);
        aboutCar();
    }
}
