package Loops_LacosWithWhile_For.exercicios;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o ano atual:");
        int valor = scanner.nextInt();
        int result = 0;

        if(valor % 4 == 0){
            result += 1;
            if (valor % 100 == 0){
                result +=2;
                if (valor % 400 == 0){
                    result +=3;
                }
            }
        }
        if ((result == 1) || (result == 6) || (result == 4)){
            System.out.println("Ano:"+valor+" ele é bissexto.");
        }

        scanner.close();
    }

}
