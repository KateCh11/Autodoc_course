package homeworks.hw20Burger;

public enum BurgerSize {
    SMALL(5),

    MEDIUM(10),

    LARGE(15);

    private double price;  // Цена бургера

    BurgerSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
