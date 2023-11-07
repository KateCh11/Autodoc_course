package homeworks.hw20Burger;

public enum MeatType {
    BEEF(29.99),

    CHICKEN(34.99),

    FISH(84.99);

    private double price;  // Цена мяса

    MeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
