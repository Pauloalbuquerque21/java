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
        
        int valor = 1;
        

        while(valor<= 10){
            
            System.out.println("Digite o valor "+valor+":");
            int valor_armazenado = scanner.nextInt();
            arquivo[valor] = valor_armazenado;
            valor = valor + 1;
            System.out.println(valor_armazenado);
            

            
        }

        for (int i=0;i<arquivo.length;i++) {
            System.out.println(arquivo[i]);
        }






    }
}