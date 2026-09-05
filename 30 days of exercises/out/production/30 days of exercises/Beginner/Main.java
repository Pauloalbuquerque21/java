import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String definitionValuerUser = scanner.next();
        if (definitionValuerUser == null){
            return;
        }
        int definitionValuerUserTwe = Integer.parseInt(definitionValuerUser);
        int[] ourArrayWithOneandTwes = new int[definitionValuerUserTwe];

        for (int i = 0; i < definitionValuerUserTwe; i++) {
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
        System.out.println(times);
        scanner.close();
    }


}