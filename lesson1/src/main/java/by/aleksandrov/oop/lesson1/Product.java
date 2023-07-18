package by.aleksandrov.oop.lesson1;

public abstract class Product {
    private String name;
    private double cost;

    /**
     * @param name Name of a product
     * @param cost Cost of a product
     * */
    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
