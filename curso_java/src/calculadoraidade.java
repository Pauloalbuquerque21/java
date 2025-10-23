import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadoraidade {
    public static void main(String[] args) {
        //calculadora de idade
        //vamos pegar o ano do nascimento de diminuir com a data de hoje

        //Scanner é uma class usada para leitura de teclado, é escrito em maiusculo, pois é uma class não primitiva.
        Scanner leituraTeclado = new Scanner(System.in);


        //Class primitivas, como int, float, char, boolen usa letra minusculas
        System.out.println("Ano atual:");
        int anoAtual = leituraTeclado.nextInt();
        System.out.println("Ano do Nascimento:");
        int anoNascimento = leituraTeclado.nextInt();

        int resultado = anoAtual - anoNascimento;
        System.out.println("A idade é " +resultado);
        leituraTeclado.close();
    }
}
