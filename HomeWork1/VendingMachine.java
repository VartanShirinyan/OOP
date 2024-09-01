package HomeWork1;

import java.util.List;

public interface VendingMachine {
    void initProducts(List<Product> products); // Корректный метод и его сигнатура

    Product getProduct(String name);
}