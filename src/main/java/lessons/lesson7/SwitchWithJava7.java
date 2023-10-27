package lessons.lesson7;

public class SwitchWithJava7 {
    public static void main(String[] args) {
        String month = SwitchWithString(2);
        System.out.println(month);

    }

    public static String SwitchWithString(int month) {
        String monthChoose;

        switch (month) {
            case 1:
                monthChoose = "Январь";
                break;
            case 2:
                monthChoose = "Февраль";
                break;
            case 3:
                monthChoose = "Март";
                break;
            default:
                monthChoose = "Неизвестнй месяц";

        }
        return monthChoose;
    }
}
