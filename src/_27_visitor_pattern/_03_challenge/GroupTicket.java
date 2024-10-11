package _27_visitor_pattern._03_challenge;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement {

    private final List<TicketElement> elements = new ArrayList<>();

    @Override
    public int getPrice() {
        return elements.stream().mapToInt(TicketElement::getPrice).sum();
    }

    public void addElement(TicketElement element) {
        elements.add(element);
    }

    public List<TicketElement> getElements() {
        return elements;
    }

}
