import java.io.IOException;
import java.util.Scanner;

public class Tachograph {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfspeeds = scanner.nextInt();
        scanner.nextLine();

        if(1<=numberOfspeeds && numberOfspeeds<=1000){
            int result = 0;
            for(int i = 0; i < numberOfspeeds;i++){
                String speed = scanner.nextLine();
                String[] values = speed.split(" ");
                int valurOne = Integer.parseInt(values[0]);
                int valurTwo = Integer.parseInt(values[1]);
                result = result + (valurOne * valurTwo);
            }
            System.out.print(result);
        }else{
              throw new IllegalArgumentException("Number of speeds must be between 1 and 1000");
            }
        scanner.close();

        }
    }

