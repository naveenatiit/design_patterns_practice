package _04singleton_pattern._02improved;

public class DocumentPrinter {

    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }



}
