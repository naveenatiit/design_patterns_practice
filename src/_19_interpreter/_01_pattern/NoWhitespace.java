package _19_interpreter._01_pattern;

public class NoWhitespace implements Expression {

    @Override
    public String interpret(String context) {
        return context.replaceAll(" ", "");
    }

}
