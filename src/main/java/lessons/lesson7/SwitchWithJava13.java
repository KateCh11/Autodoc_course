package lessons.lesson7;

public class SwitchWithJava13 {
    public static void main(String[] args) {
        String month = SwitchWithString(4);
        System.out.println(month);
    }

    public static String SwitchWithString(int month) {
        return switch (month) {
            case 1:
                yield "Январь";
            case 2:
                yield "Февраль";
            case 3, 4:
                yield "Март";
            default:
                yield "Неизвестнй месяц";
        };
    }
}
