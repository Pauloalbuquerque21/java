import java.util.Random;
import java.util.Scanner;

public class procurar_elemento {
    public static void main(String[] args){
        int[] arquivo = new int[15];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        //Definir variavel
        int resultado = 0;

        //Cria os números e inclui no vetor
        for (int i=0;i<15;i++){
            int numero = random.nextInt(10);
            System.out.println(numero);
            arquivo[i] = numero;
        }

        while(resultado != 2){
            System.out.println("Digite o valor:");
            int numero_usuario = scanner.nextInt();


            //verifica o número do usuário com cada elemento que consta no vetor
            for (int i=0;i<15;i++){
                if(arquivo[i]==numero_usuario){
                    resultado = 1;
                }
            }

            //
            if(resultado== 1){
                resultado = resultado + 1;
                System.out.println("Número: "+numero_usuario+" encontrado");
            }else{
                System.out.println("Você digitou o número errado");
            }
            
        }
        

        

    }
}
