package lessons.lesson9.override;

public class LittleCat extends Cat{

    @Override
    public void voice(){
        System.out.println("Little mow");
        super.voice(); // super это всегда родитель
    }
}
