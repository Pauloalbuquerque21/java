package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bill {
    public static void main(String[] args) throws IOException {
        //InputStreamReader: Transforma os bytes crus que vêm da entrada padrão (teclado/sistema) em caracteres legíveis.
        InputStreamReader ir = new InputStreamReader(System.in);
        //BufferedReader: Cria um "buffer" (uma memória temporária) para ler blocos de caracteres de uma só vez, o que acelera drasticamente a leitura do programa.
        BufferedReader in = new BufferedReader(ir);
        //Para que serve: É um método do BufferedReader que lê uma linha inteira de texto de uma vez só (tudo o que foi digitado até você apertar o Enter).
        //Para que serve: Como o readLine() sempre lê os dados como texto (String), o computador não sabe fazer contas matemáticas com eles diretamente. O Integer.parseInt() pega esse texto e o converte em um número inteiro (int).
        int numberOfTime = Integer.parseInt(in.readLine());
        for(int i = 0;i < numberOfTime; i++){
            int valueFriend = Integer.parseInt(in.readLine());
            if(valueFriend % 2 ==0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }

        }

    }
}
