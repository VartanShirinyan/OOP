package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> productList;
    private int money;

    public HotDrinkVendingMachine() {
        productList = new ArrayList<>();
        money = 0;
    }

    @Override
    public void initProducts(List<Product> products) {
        productList.addAll(products);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume
                        && hotDrink.getTemperature() == temperature) {
                    money += hotDrink.getPrice();
                    return hotDrink;
                }
            }
        }
        return null;
    }
}
