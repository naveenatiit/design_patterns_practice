package _19_interpreter._01_pattern;

public class FirstLetterShouldNotBeUnderscore implements Expression {

    private final FirstLetterShouldBeLowerCase firstLetterShouldBeLowerCase = new FirstLetterShouldBeLowerCase();
    @Override
    public String interpret(String context) {
        if (context.startsWith("_")) {
            context = context.substring(1);
        }
        return firstLetterShouldBeLowerCase.interpret(context);
    }
}
