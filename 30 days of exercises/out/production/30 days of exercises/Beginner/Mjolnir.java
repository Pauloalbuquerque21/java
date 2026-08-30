import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Mjolnir {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int numberParticipant = Integer.parseInt(in.readLine());
        for(int i = 0; i < numberParticipant; i++){
            String nameParticipantAndPower = in.readLine();
            String[] ArrayParticipantAndPower = nameParticipantAndPower.split(" ");
            if(ArrayParticipantAndPower[0].toLowerCase().equals("thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }

        }


    }
}
