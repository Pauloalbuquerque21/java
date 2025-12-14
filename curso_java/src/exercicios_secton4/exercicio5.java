package exercicios_secton4;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        
        //Variavel
        System.out.println("Digite o valor em Celsius:");
        double celsius = leituraTeclado.nextDouble();

        //logica para transforma
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Celsius: "+celsius+" é igual a "+fahrenheit+"Fahrenheit");


    }
}
