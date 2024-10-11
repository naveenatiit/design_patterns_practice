package _18_command._02_solution;

public class RemoveItemFromBasketOperation implements ItemOperation {

    private final Item item;

    public RemoveItemFromBasketOperation(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.removeFromBasket();
    }
}
