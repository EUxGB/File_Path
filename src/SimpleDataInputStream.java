import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try ( DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Temp\\dataOut.txt")));
              DataInputStream simpleDataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Temp\\dataOut.txt")))){
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(1112);
            dataOutputStream.writeLong(10L);
            dataOutputStream.writeUTF("Hello my cat  welcome to Home");
            dataOutputStream.flush();

            System.out.println("Short "+simpleDataInputStream.readShort());
            System.out.println("Int "+simpleDataInputStream.readInt());
            System.out.println("Long "+simpleDataInputStream.readLong());
            System.out.println("UTF "+simpleDataInputStream.readUTF());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
