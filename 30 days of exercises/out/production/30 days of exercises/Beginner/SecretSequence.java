import java.util.Random;
import java.util.Scanner;

public class SecretSequence {
    public static void main(String[] args) {

        int[] numberDefinition = {1, 2};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do User:");
        int definitionValuerUser = scanner.nextInt();


        int[] ourArrayWithOneandTwes = new int[definitionValuerUser];
        for (int i = 0; i < definitionValuerUser; i++) {
            System.out.println(i);
            int teste = random.nextInt(2);
            System.out.println(teste);
            ourArrayWithOneandTwes[i] = numberDefinition[teste];
        }

        for (int number : ourArrayWithOneandTwes) {
            System.out.print(number + " ");


        }
    }
}
