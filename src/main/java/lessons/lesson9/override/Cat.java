package lessons.lesson9.override;

public class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("Mow! Mow!");
    }

    /*public void aboutDog(){
        eat();
    }*/
}
