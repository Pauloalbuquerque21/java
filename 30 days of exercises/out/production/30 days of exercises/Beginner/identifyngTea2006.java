import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class identifyngTea2006 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        for (int i = 0; i < 2 ; i++){
            String tea = in.readLine();
            String optionTea = in.readLine();
            String[] typeTea = optionTea.split(" ");
            int answearsTea = 0;
            for (String selectTea : typeTea) {
                if (selectTea.equals(tea)) {
                    answearsTea = answearsTea + 1;
                }
            }
            System.out.println(answearsTea);

        }

    }

}