package homeworks.hw20Burger;

public enum Ingridient {
    CHEESE(13),

    TOMATO(12),

    LETTUCE(11);

    private double price;  // Цена ингредиента

    Ingridient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
