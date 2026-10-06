import java.io.IOException;
import java.util.Scanner;
public class TrianglesAndRegular {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfPolygon = scanner.nextInt();
        int result = 0;
        if (numberOfPolygon < 3 || numberOfPolygon > 1000000000) {
            throw new IllegalArgumentException("Number of polygon must be between 3 and 10000000000");
        } else {
            result = numberOfPolygon - 2;
        }
        System.out.println(result);
        scanner.close();
    }
}