package _19_interpreter._01_pattern;

public class App {

    public static void main(String[] args) {
        var context = "_My Variable";
        var firstLetterShouldNotBeUnderscore = new FirstLetterShouldNotBeUnderscore();
        var result = firstLetterShouldNotBeUnderscore.interpret(context);
        System.out.println(result);
    }

}
