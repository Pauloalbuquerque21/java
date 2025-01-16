package section7.exercicios;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {

        int[] valores = new int[10];
        int valor = 0;
        for(int index = 0;index <10;index++){
            valor = valor + 1;
            valores[index] = valor;}

        for(int posicao = 0;posicao < valores.length;posicao++){
            System.out.println(valores[posicao]);
        }
    }


}
