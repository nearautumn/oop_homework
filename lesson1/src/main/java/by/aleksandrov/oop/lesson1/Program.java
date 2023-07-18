package by.aleksandrov.oop.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // инициализация напитков
        HotDrink coffee1 = new HotDrink("Espresso", 3.5, 75);
        HotDrink coffee2 = new HotDrink("Americano",5.5 , 70);
        HotDrink tea1 = new HotDrink("Black tea", 2.5, 72);
        HotDrink tea2 = new HotDrink("Cold tea", 2.0, 15);

        // инициализация торгового аппарата
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();

        // загрузка напитков в аппарат
        List<Product> drinks = new ArrayList<>();
        drinks.add(coffee1);
        drinks.add(coffee2);
        drinks.add(tea1);
        drinks.add(tea2);
        machine.addProduct(drinks);

        // просмотр продуктов
        System.out.println(machine.getProduct("Espresso"));
        System.out.println(machine.getProduct(tea2.getName()));
        //System.out.println(machine.getProduct("Green tea")); // генерирует исключение
    }
}
