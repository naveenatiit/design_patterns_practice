package _09_adapter_structural_design_patterns._05_solution;

public class FrenchMessageAdapter implements LocalizedMessage {

    private final FrenchLocalizedMessage frenchLocalizedMessage;

    public FrenchMessageAdapter() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }

}
