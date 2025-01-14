package section6.exercicios;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int resultado = scanner.nextInt();

        String valor = ((resultado % 2) == 0) ? "Número par" : "Número impar";
        System.out.println(valor);
    }
}
