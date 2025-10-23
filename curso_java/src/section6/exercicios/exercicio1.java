package section6.exercicios;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1 - Domingo");
        System.out.println("2 - SegundaFeira");
        System.out.println("3 - TerçaFeira");
        System.out.println("4 - QuartaFeira");
        System.out.println("5 - QuintaFeira");
        System.out.println("6 - SextaFeira");
        System.out.println("7 - SábadoFeira");
        System.out.println("Qual dia da semana:");
        int resultado = scanner.nextInt();

        switch(resultado){
            case 1:
                System.out.print("Você escolheu Domíngo");
                break;
            case 2:
                System.out.print("Você escolheu Segunda");
                break;
            case 3:
                System.out.print("Você escolheu Terça");
                break;
            case 4:
                System.out.print("Você escolheu Quarta");
                break;
            case 5:
                System.out.print("Você escolheu Quinta");
                break;
            case 6:
                System.out.print("Você escolheu Sexta");
                break;
            case 7:
                System.out.print("Você escolheu Sábado");
                break;



        }
    }
}
