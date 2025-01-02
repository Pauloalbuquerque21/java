package exercicios_secton4;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Qual valor:");
        //Variavel
        double variavel =leituraTeclado.nextDouble();
        if (variavel > 0) {
            System.out.println("O valor é positivo");

        }else if(variavel == 0){
            System.out.println("O valor é zero");
        }else{
            System.out.println("O valor é negativo");
        }
    }
}

