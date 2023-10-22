package lessons.lesson11.logical.constructors;


public class Launch {
    public static void main(String[] args) {
        Animal animal = new Animal("cat", "6");
        animal.sayAnimalName();
        animal.sayAnimalAge();

        Animal animal2 = new Animal("dog", "20");
        animal2.sayAnimalName();
        animal2.sayAnimalAge();

        Animal animal3 = new Animal();
        animal3.animalCountry();
    }
}
