import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Outpustream_ASCII {
    public static void main(String[] args) {
        Writer writer = new OutputStreamWriter(new File("C:\\temp.txt"), StandardCharsets.US_ASCII);
    }
}
