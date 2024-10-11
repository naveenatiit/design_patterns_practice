package _27_visitor_pattern._02_solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private final String name;
    private final List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
