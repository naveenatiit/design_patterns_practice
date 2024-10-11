package _27_visitor_pattern._04_solution;

public interface Visitor {

    void visit(AdultTicket ticket);
    void visit(GroupTicket ticket);

}
