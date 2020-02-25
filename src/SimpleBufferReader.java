import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
