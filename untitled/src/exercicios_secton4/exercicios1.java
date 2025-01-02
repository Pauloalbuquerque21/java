package exercicios_secton4;
import java.util.Scanner;

public class exercicios1 {
    public static void main(String[] args) {

        Scanner leituraTeclado = new Scanner(System.in);

        //conseguir as variaveis
        System.out.println("Variavel 1:");
        int variavel1 = leituraTeclado.nextInt();
        System.out.println("Variavel 2:");
        int variavel2 = leituraTeclado.nextInt();

        //operação
        double resultado = variavel1 + variavel2;

        System.out.println("resultado soma: "+resultado);
    }
}
