import java.io.IOException;
import java.util.Scanner;

public class PaperPlanes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String amountOfInformation = scanner.nextLine();
        String dataOfUsersplitInList[] = amountOfInformation.split(" ");
        int numberOfCompetitors = Integer.parseInt(dataOfUsersplitInList[0]);
        int numberOfPaperSheets = Integer.parseInt(dataOfUsersplitInList[1]);
        int numberOfSheetsForEachCompetitor = Integer.parseInt(dataOfUsersplitInList[2]);

        int result = numberOfPaperSheets;
        int time = 0;
        while (time < numberOfCompetitors) {

            result = result - numberOfSheetsForEachCompetitor;
            time++;
        }

        if (result < 0) {
            System.out.println("N");
        } else {
            System.out.println("S");
    }
    scanner.close();
    }
}
