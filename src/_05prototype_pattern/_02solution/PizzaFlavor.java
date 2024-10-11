package _05prototype_pattern._02solution;

public class PizzaFlavor {

    private String name;

    public PizzaFlavor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
