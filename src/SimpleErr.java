
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleErr {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:\\") ;
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println("Что-то пошло не так");
            System.err.println("Файл не существует");
            e.printStackTrace();
        }


    }
}
