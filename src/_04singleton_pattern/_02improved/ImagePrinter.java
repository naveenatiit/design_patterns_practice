package _04singleton_pattern._02improved;

public class ImagePrinter {


    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }

}
