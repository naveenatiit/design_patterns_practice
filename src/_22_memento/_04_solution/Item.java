package _22_memento._04_solution;

public class Item {

    private int price;
    private ItemState state = new ItemState(price);

    public Item(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save() {
        state.setState(price);
    }

    public void undo() {
        price = state.getState();
    }
}
