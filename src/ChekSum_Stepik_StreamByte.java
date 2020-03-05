import java.io.IOException;
import java.io.InputStream;

public class ChekSum_Stepik_StreamByte {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int arri;
        int sum = 0;
        while ((arri = inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ arri;
        }
        System.out.println(sum);
        return sum;
    }
}
//            System.out.printf("for %d  = %10s%n", tmp, Integer.toBinaryString(tmp)+"  ");
//            System.out.printf("shif%d  = %10s%n", tmp, Integer.toBinaryString(Integer.rotateLeft(tmp,1))+"  ");
//            System.out.printf("xor %d  = %10s%n", tmp, Integer.toBinaryString(Integer.rotateLeft(tmp,1)^tmp)+"  ");
//            System.out.println();
//            int i = Integer.rotateLeft(tmp,1);

