package _05prototype_pattern._02solution;

public class Pizza extends Meal {

    private PizzaFlavor flavor;

    public Pizza(int price, PizzaFlavor flavor) {
        super(price);
        this.flavor = flavor;
    }

    public PizzaFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(PizzaFlavor flavor) {
        this.flavor = flavor;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "price='" + super.getPrice() + '\'' +
                "flavor='" + flavor + '\'' +
                '}';
    }

    @Override
    public Pizza clone() {
        return new Pizza(this.getPrice(), this.getFlavor());
    }

    /* if you want your pizzaflavor not to be shared then use :
     public Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavor(this.getFlavor().getName()));
    }
    */
}
