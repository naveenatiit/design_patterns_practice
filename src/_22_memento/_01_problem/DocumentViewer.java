package _22_memento._01_problem;

public class DocumentViewer {

    public static void main(String[] args) {
        var textDocument = new TextDocument();
        textDocument.write("Hello, world! ");
        textDocument.print();
        textDocument.write("How are you?");
        textDocument.print();
    }

}
