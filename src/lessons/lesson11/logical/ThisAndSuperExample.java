package lessons.lesson11.logical;

public class ThisAndSuperExample {
    int value = 18;
}

class Chaild extends ThisAndSuperExample{
    int value = 20;

    public void print(){
        int value = 38;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);//super это обращение к родителю
    }

}
