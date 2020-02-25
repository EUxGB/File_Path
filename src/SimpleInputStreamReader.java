import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInputStreamReader {
    public static void main(String[] args) throws IOException {
//           int i = System.in.read();
//           System.out.println(i);
//           System.out.println((char) i);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println(i2);
        System.out.println((char) i2);


    }
}
