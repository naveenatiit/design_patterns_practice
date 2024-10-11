package _04singleton_pattern._01example;

public class DocumentPrinter {

    public void printDocument() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }



}
