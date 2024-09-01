package HomeWork1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();

        // Инициализация продуктов
        HotDrink tea = new HotDrink("Tea", 150, 500, 85);
        HotDrink coffee = new HotDrink("Coffee", 200, 300, 90);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 180, 400, 70);

        hotDrinkVendingMachine.initProducts(Arrays.asList(tea, coffee, hotChocolate));

        // Запрос продукта по имени
        Product product = hotDrinkVendingMachine.getProduct("Tea");
        System.out.println("Получен продукт: " + product);

        // Запрос продукта по имени, объему и температуре
        HotDrink specificProduct = hotDrinkVendingMachine.getProduct("Coffee", 300, 90);
        System.out.println("Получен продукт с заданным объемом и температурой: " + specificProduct);

        // Попытка получить несуществующий продукт
        Product notFoundProduct = hotDrinkVendingMachine.getProduct("Coca-Cola");
        System.out.println("Получен продукт: " + notFoundProduct);
    }
}
