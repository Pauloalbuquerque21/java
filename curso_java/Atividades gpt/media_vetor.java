import java.util.Scanner;


public class media_vetor{
    //Crie um programa que:
    //Peça ao usuário 10 números;
    //Armazene em um vetor;
    //Calcule e exiba:
    //A soma,
    //A média,
    //O maior número,
    //O menor número.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Números solicitado para o usuário 
        int[] arquivo= new int[10];
        System.out.println("Digite 10 dígitos:");
        

        int valor = 0;


        while(valor < 10){
            
            System.out.println("Digite o valor "+valor+":");
            int valor_armazenado = scanner.nextInt();
            arquivo[valor] = valor_armazenado;
            valor = valor + 1;
        }

        for (int i=0;i<arquivo.length;i++){
            System.out.println(arquivo[i]);
        }

        int valor_soma = 0;
        float valor_media = 0;
        int valor_maior = 0;
        int valor_menor = 0;
        for(int i=0;i<arquivo.length-1;i++){
            valor_soma = arquivo[i] + valor_soma;
        }
        System.out.println(valor_soma);

        for(int i=0;i<arquivo.length-1;i++){
            valor_media = arquivo[i] + valor_media;
        }
        System.out.println("Valor da média:"+valor_media+" arquivo: "+arquivo.length);
        System.out.println(valor_media/arquivo.length);


        valor_maior = arquivo[0];
        valor_menor = arquivo[0];

        for(int i=0;i<arquivo.length-1;i++){
            
            if(valor_maior < arquivo[i]){
                valor_maior = arquivo[i];
            }else if(valor_menor > arquivo[i]){
                valor_menor = arquivo[i];
            }
        }

        System.out.println("Valor da maior:"+valor_maior+"\n Valor de maior:"+valor_menor);





    }
}