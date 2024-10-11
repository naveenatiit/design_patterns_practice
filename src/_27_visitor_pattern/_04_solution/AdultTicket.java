package _27_visitor_pattern._04_solution;

public class AdultTicket implements TicketElement {

    private int price = 10;

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
