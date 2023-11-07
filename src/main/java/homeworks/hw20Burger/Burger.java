package homeworks.hw20Burger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burger {
    private BurgerSize size;
    private MeatType meat;

    private List<Ingridient> ingredients;

    private double basePrice;

    public Burger(BurgerSize size, MeatType meat, List<Ingridient> ingredients) {
        this.size = size;
        this.meat = meat;
        this.ingredients = new ArrayList<>(ingredients);
        this.basePrice = size.getPrice() + meat.getPrice();
    }

    public double calculatePrice() {
        double grandPrice = basePrice;

        for (Ingridient ingredient : ingredients) {
            grandPrice += ingredient.getPrice();
        }

        return grandPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в бургерную!");

        //-------------------------------------------------------------------
        // Вывод доступных размеров бургеров
        System.out.println("\nДоступные размеры бургеров:");
        for (BurgerSize size : BurgerSize.values()) {
            System.out.println(size);
        }

        // Выбор размера бургера
        System.out.println("Выберите размер бургера: ");

        BurgerSize size = null;
        while (size == null) {
            try {
                size = BurgerSize.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Такого размера бургера нет. Попробуйте выбрать корректный размер бургера.");
            }
        }

        //-------------------------------------------------------------------
        // Вывод доступного типа мяса
        System.out.println("\nДоступные типы мяса:");
        for (MeatType meat : MeatType.values()) {
            System.out.println(meat);
        }

        System.out.println("Выберите тип мяса: ");

        MeatType meat = null;
        while (meat == null) {
            try {
                meat = MeatType.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Такого типа мяса нет. Попробуйте выбрать корректный тип мяса.");
            }
        }

        //-------------------------------------------------------------------
        /*
        // Вывод доступных ингридиентов
        System.out.println("\nДоступные ингридиенты:");
        for (Ingredient ingredients : Ingredient.values()) {
            System.out.println(ingredients);
        }

        System.out.println("Выберите ингридиент: ");
        Ingredient ingredients = Ingredient.valueOf(scanner.nextLine());*/

        // Ввод ингредиентов
        List<Ingridient> choseIngredients = new ArrayList<>();
        System.out.println("\nДобавьте ингредиенты (для завершения введите 'Готово'):");

        for (Ingridient ingredient : Ingridient.values()) {
            System.out.println(ingredient);
        }

        while (true) {
            System.out.println("Добавьте ингредиент или введите 'Готово': ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("ГОТОВО")) {
                break;
            }

            try {
                choseIngredients.add(Ingridient.valueOf(input));
            } catch (IllegalArgumentException e) {
                System.out.println("Такого ингридиента нет. Пожалуйста, выберите снова.");
            }
        }

        Burger burger = new Burger(size, meat, choseIngredients);
        System.out.println("\nСАМЫЙ ВКУСНЫЙ БУРГЕР ГОТОВ. ПОДЫТОЖИМ: ");
        System.out.println(burger.getDescription());

        scanner.close();
    }

    public String getDescription() {
        String description = "Размер бургера: " + size + "\n";
        description += "Тип мяса: " + meat + "\n";
        description += "Ингредиенты: " + ingredients + "\n";
        description += "Цена вашего бургера: " + Math.ceil(calculatePrice()) + " UAH\n";
        return description;
    }
}
