package _27_visitor_pattern._02_solution;

public interface FileSystemElement {

    String getName();

    void accept(Visitor visitor);

}
