import java.io.File;
import java.io.IOException;

public class FileBasic {



    public static void main(String[] args) throws IOException {
        String s1 = "C:\\Temp\\projects\\k.1";
        String s2 = "D:\\NokolaysDocs\\temp\\projects\\01._my_file\\file.txt";
        String s3 = "Z:\\Windows";
        String s4 = "file.txt";
        String [] paths = {s1,s2,s3,s4};

        File fileto = new File(s1);
        File myfile = new File(s2);

        System.out.println(s2 + "   "+myfile.exists());
        System.out.println("-->"+s1+ "   "+fileto.exists());

        System.out.println(myfile.renameTo(fileto));

//        for (String path : paths) {
//            File file = new File(path);
//            System.out.println();
//            System.out.printf("  Проверка пути к файлу                      ; %s%n " ,path);
//            String b1 = file.getCanonicalPath();
//            boolean b2 = file.isFile();
//            boolean b3 = file.isDirectory();
//            long b4 = file.length();
//            long b5 = file.lastModified();
//            String [] b6 = file.list();
//            boolean a0 = file.isAbsolute();
//            boolean a1 =  file.canExecute();
//            boolean a2 = file.canRead();
//            boolean a3 = file.canWrite();
//            long a4 = file.getFreeSpace();
//            String c1 = file.getAbsolutePath();
//            String c2 = file.getPath();
//            String c3 = file.getName();
//            String c4 = file.getParent();
//
//            System.out.printf(
//                            "   String b1 = file.getCanonicalPath()         ; %s%n" +
//                            "   boolean b2 = file.isFile()                  ; %b%n " +
//                            "   boolean b3 = file.isDirectory()             ; %b%n " +
//                            "   long b4 = file.length()                     ; %d%n " +
//                            "   long b5 = file.lastModified()               ; %d%n " +
//                            "   String [] b6 = file.list()                  ; %s%n " +
//                            "   boolean a0 = file.isAbsolute()              ; %b%n " +
//                            "   boolean a1 =  file.canExecute()             ; %b%n " +
//                            "   boolean a2 = file.canRead()                 ; %b%n " +
//                            "   boolean a3 = file.canWrite()                ; %b%n " +
//                            "   long a4 = file.getFreeSpace()               ; %d%n " +
//                            "   String c1 = file.getAbsolutePath()          ; %s%n " +
//                            "   String c2 = file.getPath()                  ; %s%n " +
//                            "   String c3 = file.getName()                  ; %s%n " +
//                            "   String c4 = file.getParent()                ; %s%n ",
//                            b1,b2,b3,b4,b5,b6,a0,a1,a2,a3,a4,c1,c2,c3,c4);
//
//        }











    }



}
