package by.aleksandrov.oop.lesson1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private final List<Product> products;
    public BottleOfWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product %s not found", name));
    }

    public boolean addProduct(List<Product> productList) {
        if (products == null && productList == null) {
            return false;
        }
        products.addAll(productList);
        return true;
    }
}
