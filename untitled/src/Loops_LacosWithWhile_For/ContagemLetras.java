package Loops_LacosWithWhile_For;
import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");


        String frase = scanner.nextLine();
        int quantidadeLetras = 0;
        //Usamos o método ".length()" para conseguir o tamanho da array ou string
        for (int indice = 0 ; indice < frase.length() ; indice++){
            //O método charAT é da class String, e tem como objetico ver a posição do caracter na string
            //char:é um tipo primitivo que armazena caracteres
            char letra = frase.charAt(indice);
            //Class Character é um class para o tipo char e tem vários métodos, e uma deles
            // é o isLetter(char c), tem como objetivo verificar se é uma letra
            boolean isLetra = Character.isLetter(letra);

            if(isLetra){
                quantidadeLetras++;
            }
        }

        System.out.println("A quantidade de letras é:" + quantidadeLetras);
    }
}
