import java.io.IOException;
import java.util.Scanner;

public class SimpleFactorial {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int factorialValue = scanner.nextInt();
        int valueResult = factorialValue;
        while(factorialValue != 1) {
            factorialValue--;
            valueResult = valueResult * factorialValue;
        }
        System.out.print(valueResult);
        scanner.close();
    }
}
