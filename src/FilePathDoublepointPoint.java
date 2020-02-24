//        Найдите среди приведенных путей два эквивалентных, то есть указывающих на один и тот же файл.

//        a\b\..\file.txt
//
//        .\a\b\..\b\c\.\file.txt
//
//        a\b\c\file.txt
//
//        a\.\b\..\c\.\file.txt
//
//        a\..\b\c\file.txt


import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FilePathDoublepointPoint {

    public static void main(String[] args) throws IOException {
        String s1 =     "C:\\Temp\\a\\b\\..\\file.txt";
        String s2 =     "C:\\Temp\\.\\a\\b\\..\\b\\c\\.\\file.txt";
        String s3 =     "C:\\Temp\\a\\b\\c\\file.txt";
        String s4 =     "C:\\Temp\\a\\.\\b\\..\\c\\.\\file.txt";
        String s5 =     "C:\\Temp\\a\\..\\b\\c\\file.txt";
        String [] s = {s1,s2,s3,s4,s5};


        for (String path : s) {
            Path file = Paths.get (path);
            System.out.printf("Для пути %s верна следующая нормализация %s%n",path, file.normalize());

        }
        System.out.println();
        for (String path : s) {
            File ff = new File(path);
            System.out.printf("Для пути %s верна следующая нормализация %s%n",path, ff.getCanonicalPath());

        }

    }






}
