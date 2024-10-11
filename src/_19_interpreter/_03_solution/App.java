package _19_interpreter._03_solution;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        System.out.println(context);

        var sentenceShouldEndWithPeriod = new SentenceShouldEndWithPeriod();
        var result = sentenceShouldEndWithPeriod.interpret(context);
        System.out.println(result);
    }

}
