import java.io.IOException;
import java.util.Scanner;

public class ExamGrades {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valuerOfUser = scanner.nextInt();

        if(valuerOfUser == 0){
            System.out.println("E");
        }else if (1 <= valuerOfUser && valuerOfUser <=35){
            System.out.println("D");
        }else if(36<= valuerOfUser && valuerOfUser <= 60){
            System.out.println("C");
        }else if(61<= valuerOfUser && valuerOfUser <= 85){
            System.out.println("B");
        }else if(86 <= valuerOfUser && valuerOfUser <= 100){
            System.out.println("A");
        }
        scanner.close();
    }
}
