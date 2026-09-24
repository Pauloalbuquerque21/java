package Beginner;
import java.util.Scanner;
public class Race {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String informationOfUser = scanner.nextLine();
        String[] informations = informationOfUser.split(" ");

        int whatOfUserRunied = Integer.parseInt(informations[0]);
        int leghtOfTrack = Integer.parseInt(informations[1]);
        if(0 > whatOfUserRunied || whatOfUserRunied > 100000000){
            throw new IllegalArgumentException("The problema is the The whatOfUserRunied: first number must be between 0 and 100000000");
        }
        else if(0 > leghtOfTrack || leghtOfTrack > 100){
            throw new IllegalArgumentException("The problema is on leghtOfTrack: The second number must be between 0 and 100");
        }else {
            int whatIwant = whatOfUserRunied % leghtOfTrack;
            System.out.println(whatIwant);
        }

        scanner.close();

    }

}
