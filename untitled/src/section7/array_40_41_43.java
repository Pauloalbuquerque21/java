package section7;

import java.sql.SQLOutput;

public class array_40_41_43 {
    public static void main(String[] args) {
        //exemplos de um array, tipo[] variavel = {itens separados por virgulas}
        String[] semana = {"Segunda","Terça","Quarta","Quinta","Sexta"};

        System.out.println(semana[0]);
        System.out.println(semana[1]);
        System.out.println(semana[2]);
        System.out.println(semana[3]);

        for(int index = 0 ;index < semana.length;index++){
            System.out.println("-------------------------------");
            System.out.println(semana[index]);
        //Foreach tem um estrutura diferênte, usamos o :
        }
        //for-each
        for(String dia : semana){
            System.out.println("-=-=-=-=-=-==-=-=-=-=-=-=-=");
            System.out.println(dia);

        }

        int[] numeros = new int[5];
        int valor = 0;
        for(int numero: numeros){
            valor += 1;
            numero = valor;
        }
        System.out.println("Numeros:"+numeros);



    }
}
