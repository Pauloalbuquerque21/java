package section7.exercicios;
import  java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        //Importamos a class Scanner e transofarmos a variavel scanner para usar para captura as informações do teclado.
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];

        //Um laço for, para poder incluir as informações o array nomes
        for(int nome = 0;nome < nomes.length;nome++){
            nomes[nome] = scanner.nextLine();
        }
        //agora imprimir os nomes

        for(int nome = 5;nome >= 0;nome = nome - 1){
            System.out.println(nomes[nome]);
        }

        }

    }

