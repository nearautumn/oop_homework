package by.aleksandrov.oop.lesson1;

import java.util.List;

/**
 * Реализуйте класс товар, сод. данные о товаре
 * и торговый автомат, сод в себе методы initProducts
 * (List<Product>) сохраняющий в себя список исходных продуктов и getProduct(String name)
 * */

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
    boolean addProduct(List<Product> productList);
}