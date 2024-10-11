package _27_visitor_pattern._01_problem;

public class File implements FileSystemElement {

    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }


}
