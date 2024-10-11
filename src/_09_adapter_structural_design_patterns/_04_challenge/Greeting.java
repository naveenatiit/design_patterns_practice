package _09_adapter_structural_design_patterns._04_challenge;

public class Greeting {

    private final LocalizedMessage localizedMessage;

    public Greeting(LocalizedMessage localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public void print() {
        localizedMessage.sayHello();
    }


}
