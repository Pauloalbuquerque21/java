package loop;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Receber o valor
        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();
        int maximo = 100;

        //Loop
        if ((valor % 2) == 0){

            while(valor <= maximo){
                valor = valor + 2;
                System.out.println(valor);
            }
        }else{
            //valor++ ou valor += valor mesmo resultado
            valor = valor +1;
            while(valor <= maximo){
                System.out.println(valor);
                valor = valor + 2;
            }
        }
    }
}
