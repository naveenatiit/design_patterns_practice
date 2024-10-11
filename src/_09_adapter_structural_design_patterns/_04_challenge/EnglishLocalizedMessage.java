package _09_adapter_structural_design_patterns._04_challenge;

public class EnglishLocalizedMessage implements LocalizedMessage {


    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
