package section6;
import java.util.Scanner;

public class LoopComDoWhile_switc_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        do {

            System.out.println("Sanduiche - 1");
            System.out.println("Pizza - 2");
            System.out.println("Sorvete - 3");
            System.out.println("Sair - 0");
            System.out.println("Escolha umas das opções:");

            resultado = scanner.nextInt();
            int valorTotal = 0;

            //No switch, você pode usar opções e usa o break para parar nessa opção
            switch (resultado){
                case 1:
                    System.out.println("Sanduiche");
                    valorTotal +=10;
                    break;
                case 2:
                    System.out.println("Pizza");
                    valorTotal +=30;
                    break;
                case 3:
                    System.out.println("Sorvete");
                    valorTotal += 5;
                    break;
                case 0:
                    System.out.println("Finalizando o pedido!");
                    break;
            }

            if(resultado == 3){
                System.out.println("Seu pedido foi uma pizza");
            }else if(resultado == 2) {
                System.out.println("Seu pedido foi um Hambúrgue");
            }else if(resultado == 1){
                System.out.println("Seu pedido foi um sorvete");
            }else if(resultado == 0){
                System.out.println("Saindo");
            }

        }while( resultado != 0);

        scanner.close();
    }
}
