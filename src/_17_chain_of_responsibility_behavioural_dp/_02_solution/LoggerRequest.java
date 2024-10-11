package _17_chain_of_responsibility_behavioural_dp._02_solution;

public class LoggerRequest {

    private final String message;
    private final LoggerType loggerType;

    public LoggerRequest(String message, LoggerType loggerType) {
        this.message = message;
        this.loggerType = loggerType;
    }

    public String getMessage() {
        return this.message;
    }

    public LoggerType getLoggerType() {
        return this.loggerType;
    }

    public enum LoggerType {
        CONSOLE,
        FILE
    }

}
