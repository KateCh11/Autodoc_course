package lessons.lesson11.logical.constructors;

public class Animal {
    public Animal() {

    }

    public Animal(String animalName, String animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;

    }

    private String animalName;
    private String animalAge;

    public void sayAnimalName() {
        //System.out.println("Cow");
        System.out.println(this.animalName);
    }

    public void sayAnimalAge() {
        //System.out.println("16");
        System.out.println(this.animalAge);
    }

    public void animalCountry() {
        System.out.println("From Ukraine");
    }
}
