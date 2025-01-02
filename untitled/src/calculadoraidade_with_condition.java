import java.util.Scanner;

public class calculadoraidade_with_condition {
    public static void main(String[] args) {
        //calculadora de idade
        //vamos pegar o ano do nascimento de diminuir com a data de hoje

        //Scanner é uma class usada para leitura de teclado, é escrito em maiusculo, pois é uma class não primitiva.
        Scanner leituraTeclado = new Scanner(System.in);

        //nome do usuário
        System.out.println("Qual o nome do usuário:");
        String nome = leituraTeclado.nextLine();

        //Class primitivas, como int, float, char, boolen usa letra minusculas
        System.out.println("Ano atual:");
        int anoAtual = leituraTeclado.nextInt();
        System.out.println("Ano do Nascimento:");
        int anoNascimento = leituraTeclado.nextInt();

        int resultado = anoAtual - anoNascimento;

        if(resultado < 18){
            System.out.println("O usuário "+nome+" tem "+resultado+" anos, ou seja, é menor de idade.");
        }else if(resultado < 60){
            System.out.println("O usuário "+nome+" tem "+resultado+" anos, ou seja, é maior de idade");
        }else{
            System.out.println("O usuário "+nome+" tem "+resultado+" anos, ou seja, é idoso.");
        }

        leituraTeclado.close();
    }
}
