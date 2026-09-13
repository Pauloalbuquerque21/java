import java.io.IOException;
import java.util.Scanner;
public class SquaredAndCubic {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();
        if(1 <= amountOfNumbers && amountOfNumbers <= 1000){
            for(int i = 1; i <= amountOfNumbers; i++){
                int resultOne = 0;
                int resultTwe = 0;
                int resultThree = 0;
                resultOne = i;
                resultTwe = resultOne * i;
                resultThree = resultTwe * i;

                System.out.println(resultOne+" "+resultTwe+" "+resultThree);

            }

        }else{
            throw new IllegalArgumentException("The number must be between 1 and 1000");
        }

        scanner.close();


    }
}
