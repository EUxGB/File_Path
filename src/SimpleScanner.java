import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next();
        scanner = new Scanner(System.in);
        String str2 = scanner.nextLine();

        System.out.printf("" +
                "INT                = %d%n" +
                "FLOAT              = %f%n" +
                "String (next)      = %s%n" +
                "String (nextLine)  = %s%n",i,f,str,str2);
    }
}
