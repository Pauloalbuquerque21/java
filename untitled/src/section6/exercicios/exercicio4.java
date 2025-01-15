package section6.exercicios;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        float valor = scanner.nextInt();
        System.out.println("--------------------");
        if (valor >= 2000){
            System.out.println("Vai ter importo");
            float resultado;
            //Não esquece de colocar esse "f" apos o número, para não dar erro.
            resultado = valor * 0.15f;
            valor = valor - resultado;
            System.out.println("O valor do desconto é "+resultado+" o valor do salário com o desconto é "+valor);
        }else{
            System.out.println("Não terá imposto ");
        }
    }
}
