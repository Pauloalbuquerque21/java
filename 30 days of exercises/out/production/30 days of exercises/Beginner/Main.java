import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int definitionValuerUser = scanner.nextInt();
        int[] ourArrayWithOneandTwes = new int[definitionValuerUser];

        for (int i = 0; i < definitionValuerUser; i++) {
            ourArrayWithOneandTwes[i] = scanner.nextInt();
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
        scanner.close();
    }


}