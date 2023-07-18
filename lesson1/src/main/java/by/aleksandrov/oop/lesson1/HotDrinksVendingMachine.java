package by.aleksandrov.oop.lesson1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    private List<Product> hotDrinks;

    public HotDrinksVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public HotDrinksVendingMachine(List<Product> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public Product getProduct(String name) {
        for (Product hotDrink: hotDrinks) {
            if (hotDrink.getName().equalsIgnoreCase(name)) {
                return hotDrink;
            }
        }
        throw new IllegalStateException(String.format("%s not found", name));
    }

    public boolean addProduct(List<Product> newHotDrinks) {
        if (hotDrinks == null && newHotDrinks == null) {
            return false;
        }
        hotDrinks.addAll(newHotDrinks);
        return true;
    }
}
