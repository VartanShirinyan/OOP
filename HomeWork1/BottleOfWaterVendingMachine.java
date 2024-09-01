package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> productList;
    private int money;

    public BottleOfWaterVendingMachine() {
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

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    money += product.getPrice();
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }
}
