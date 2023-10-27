package lessons.lesson7;

public class SwitchWithJava12 {
    public static void main(String[] args) {
        String month = SwitchWithString(4);
        System.out.println(month);
    }

    public static String SwitchWithString(int month) {
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3, 4 -> "Март";
            default -> "Неизвестнй месяц";
        };
    }
}
