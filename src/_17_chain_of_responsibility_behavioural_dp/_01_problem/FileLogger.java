package _17_chain_of_responsibility_behavioural_dp._01_problem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {

    @Override
    public void log(LoggerRequest request) {
        try {
            var writer = new BufferedWriter(new FileWriter("src/main/resources/log.txt", true));
            writer.write(request.getMessage() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
