package _22_memento._02_solution;

public class DocumentViewer {

    public static void main(String[] args) {
        var textBlock = new TextDocument();
        textBlock.write("Hello, world! ");
        textBlock.save();
        textBlock.print();
        textBlock.write("How are you? ");
        textBlock.print();
        textBlock.undo();
        textBlock.print();
    }

}
