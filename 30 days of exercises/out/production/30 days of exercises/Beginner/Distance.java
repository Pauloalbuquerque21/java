import java.io.IOException;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int definitionValuerUser = scanner.nextInt();
        int result;
        if (definitionValuerUser == 0) {
            return;
        } else {
            result = definitionValuerUser * 2;
        }

        System.out.println(result + " minutos");
        scanner.close();
    }

}