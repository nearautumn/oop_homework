package by.aleksandrov.oop.lesson1;

public class HotDrink extends Product{
    private  int temperature;

    /**
     * @param name Name of a product
     * @param cost Cost of a product
     * @param temperature Temperature of a product
     * */
    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    // get and set methods
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Cost: %f  Temperature: %d",
                getName(), getCost(), getTemperature());
    }
}
