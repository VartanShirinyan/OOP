package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger implements AutoCloseable {
    private final PrintWriter writer;

    public Logger(String filename) throws IOException {
        writer = new PrintWriter(new FileWriter(filename, true));
    }

    public void log(String message) {
        writer.println(message);
        writer.flush();
    }

    @Override
    public void close() {
        writer.close();
    }
}
