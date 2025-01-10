package section5_Loops_Laços_While_For;
import java.util.Scanner;

public class LoopComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Atribuir valor
        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();

        for (int contador = 1 ; contador <= valor ; contador = contador + 1){
            System.out.println(contador);
        }
        scanner.close();
    }
}
