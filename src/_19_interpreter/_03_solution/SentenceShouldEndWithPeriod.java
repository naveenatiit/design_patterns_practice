package _19_interpreter._03_solution;

public class SentenceShouldEndWithPeriod implements Expression {

    private final FirstLetterShouldBeACapital firstLetterShouldBeACapital = new FirstLetterShouldBeACapital();

    @Override
    public String interpret(String context) {;

        if (!context.endsWith(".")) {
            context += ".";
        }

        return firstLetterShouldBeACapital.interpret(context);
    }
}
