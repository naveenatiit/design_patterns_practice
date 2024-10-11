package _17_chain_of_responsibility_behavioural_dp._02_solution;

public abstract class Logger {

    public final Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(LoggerRequest request);

}
