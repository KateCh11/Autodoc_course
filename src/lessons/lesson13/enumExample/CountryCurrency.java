package lessons.lesson13.enumExample;

public enum CountryCurrency {
    CANADA("CAD"),
    POLAND("ZLT"),
    UKRAINE("UAH"),
    GERMANY; //тут будет неявный конструктор

    String currency;

    CountryCurrency(String currency) {
        this.currency = currency;
    }

    //неявный конструктор для Германии
    CountryCurrency() {

    }
}
