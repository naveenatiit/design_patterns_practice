package _27_visitor_pattern._02_solution;

public interface Visitor {

    void visit(File file);

    void visit(Directory directory);

}
