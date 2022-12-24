package errHandlerHW1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void write(Note entry) {
        try (FileWriter writer = new FileWriter(entry.getSurname() + ".txt", true)) {
            writer.write(entry.getInfo());
            writer.append('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
