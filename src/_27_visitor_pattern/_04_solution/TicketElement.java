package _27_visitor_pattern._04_solution;

public interface TicketElement {

    int getPrice();

    void accept(Visitor visitor);

}
