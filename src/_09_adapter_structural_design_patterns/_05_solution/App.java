package _09_adapter_structural_design_patterns._05_solution;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();


        var frenchLocalizedMessage = new FrenchMessageAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedMessage);
        frenchGreeting.print();
    }

}
