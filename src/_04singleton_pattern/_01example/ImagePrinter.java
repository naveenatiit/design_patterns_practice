package _04singleton_pattern._01example;

public class ImagePrinter {

    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }

}
