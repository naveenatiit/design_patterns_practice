package _17_chain_of_responsibility_behavioural_dp._01_problem;

public class ConsoleLogger extends Logger {

    @Override
    public void log(LoggerRequest request) {
        System.out.println(request.getMessage());
    }


}
