package by.aleksandrov.oop.lesson1;

public class BottleOfWater extends Product{

    private double volume;
    /**
     * @param name Name of a product
     * @param cost Cost of a product
     */
    public BottleOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    // get and set methods
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Cost: %f  Volume: %f",
                super.getName(), super.getCost(), this.getVolume());
    }
}