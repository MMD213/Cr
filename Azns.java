import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Azns {
    void cas()

    {
        File file = new File("test");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write("Привет");
            writer.close();
        } catch (
                IOException var3) {
            throw new RuntimeException(var3);
        }
    }
}
