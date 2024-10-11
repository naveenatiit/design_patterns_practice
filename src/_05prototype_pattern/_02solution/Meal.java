package _05prototype_pattern._02solution;

public abstract class Meal {

    private int price;

    public Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract Meal clone();
}
