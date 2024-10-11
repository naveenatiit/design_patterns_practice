package _04singleton_pattern._02improved;

public enum PrintSpooler {

    INSTANCE;

    private PrintSpooler() {}

    public synchronized static PrintSpooler getInstance() {
        return INSTANCE;
    }


    void print() {
        System.out.println("Printing...");
    }

}
