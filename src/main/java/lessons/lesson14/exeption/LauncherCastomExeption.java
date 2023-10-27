package lessons.lesson14.exeption;

public class LauncherCastomExeption {
    public static void main(String[] args) throws CastomExeption {
        compute(3);
    }

    public static void compute(int number) throws CastomExeption {
        System.out.println("compute метод вызываем");
        if (number > 10) {
            throw new CastomExeption(number, "some message about exceprion");
        }
        System.out.println("Нормальное завершение метода");
    }
}
