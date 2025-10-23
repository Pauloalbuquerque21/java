package section5_Loops_Laços_While_For;
import java.util.Scanner;

public class LoopComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        do {

            System.out.println("Pizza - 3");
            System.out.println("Hambúrguer - 2");
            System.out.println("Sorvete - 1");
            System.out.println("Sair - 0");
            System.out.println("Escolha umas das opções:");
            resultado = scanner.nextInt();

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
