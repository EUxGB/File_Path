import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Outpustream_ASCII {
    public static void main(String[] args) throws IOException {
        String p = "C:\\Temp\\temp.txt";
        String pе = "C:\\Temp\\temp1.txt";
        BufferedReader inputStream = new BufferedReader (new InputStreamReader (new FileInputStream(p)));
        System.out.println(inputStream.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(pе),StandardCharsets.US_ASCII));
        bufferedWriter.write(inputStream.readLine());
        bufferedWriter.flush();

//        String [] strings = new String[]  {"vskj","f","wef" };
//        Arrays.stream(strings).forEach(System.out::println);
//        System.out.println();
        //forEach(System.out::println);
       // Files.lines(Paths.get("temp.txt"),StandardCharsets.UTF_8).forEach(System.out::println);
        // lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);

//        OutputStream outputStream = new FileOutputStream("C:\\temp.txt");
//        Writer writer = new OutputStreamWriter(outputStream, "US_ASCII");
//        writer.write("Hello World");
//        writer.flush();
    }
}
