package section7.exercicios;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Colocar os valores no Array
        int[] numeros = new int[5];

        for(int numero=0;numero<numeros.length;numero++){
            numeros[numero] = scanner.nextInt();

        }
        int valor = 0;
        for(int numero=0;numero<numeros.length;numero++){
            valor = valor + numeros[numero];


        }
        valor = valor / 5;
        System.out.println(valor);



    }
}
