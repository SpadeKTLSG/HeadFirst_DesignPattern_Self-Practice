public abstract class Beverage {
    public String description = "Unknown Home.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
