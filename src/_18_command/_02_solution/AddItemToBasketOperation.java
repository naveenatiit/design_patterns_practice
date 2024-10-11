package _18_command._02_solution;

public class AddItemToBasketOperation implements ItemOperation {

    private final Item item;

    public AddItemToBasketOperation(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.addToBasket();
    }
}
