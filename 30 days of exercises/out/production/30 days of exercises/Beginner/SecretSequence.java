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
            if(i == 0 || i == definitionValuerUser - 1){
                ourArrayWithOneandTwes[i] = 1;
                System.out.print("Teste:");
                System.out.println(i);
            }else{
                System.out.println(i);
                int teste = random.nextInt(2);
                System.out.println(teste);
                ourArrayWithOneandTwes[i] = numberDefinition[teste];
            }

        }

        int times = 0;
        for (int i = 0; i < ourArrayWithOneandTwes.length; i++) {
            if(i == 0){
                times = times + 1;
            }else if(ourArrayWithOneandTwes[i] != ourArrayWithOneandTwes[i - 1]){
                times = times + 1;
            }
        }
        System.out.print(times);
    }
}
