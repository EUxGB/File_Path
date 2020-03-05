import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.US_ASCII;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Outpustream_ASCII {
    public static void main(String[] args) throws IOException {
        String p = "C:\\Temp\\temp.txt";
        String pе = "C:\\Temp\\temp1.txt";
        //Scanner scanner = new Scanner(System.in);
        byte [] ii = new byte[] {48, 49, 50, 51};
        ByteArrayInputStream inputStreamReader = new ByteArrayInputStream(ii);
        System.out.println(readAsString(inputStreamReader,UTF_8));
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out,StandardCharsets.US_ASCII);
//        int x = 0;
//        while (( x = inputStreamReader.read() )!=-1) {
//            //int x = inputStreamReader.read();
//            outputStreamWriter.write(x);
//
//
//            System.out.println(x);
//        }
//        //System.out.println(scanner.nextLine());
//
////        BufferedReader inputStream = new BufferedReader (new InputStreamReader (new FileInputStream(p)));
////        System.out.println(inputStream.readLine());
////        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(pе),StandardCharsets.US_ASCII));
////        bufferedWriter.write(inputStream.readLine());
////        bufferedWriter.flush();
//
////        String [] strings = new String[]  {"vskj","f","wef" };
////        Arrays.stream(strings).forEach(System.out::println);
////        System.out.println();
//        //forEach(System.out::println);
//       // Files.lines(Paths.get("temp.txt"),StandardCharsets.UTF_8).forEach(System.out::println);
//        // lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);
//
////        OutputStream outputStream = new FileOutputStream("C:\\temp.txt");
////        Writer writer = new OutputStreamWriter(outputStream, "US_ASCII");
////        writer.write("Hello World");
////        writer.flush();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String ss = new String();
        int x;
        while (( x = inputStream.read() )!=-1) {
            ss = ss + x;

        }
        return  ss;


       // return "not";
    }

}

