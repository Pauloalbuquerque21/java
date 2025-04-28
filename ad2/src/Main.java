import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        //Entrada para quantas plataformas
        System.out.print("Quantas plataformas serão cadastradas?");
        int quantidade_catalogo = leituraTeclado.nextInt();

        //resolver o problema, pois quando tem um input de o int depois um input de string, o de string pula
        leituraTeclado.nextLine();

        //Array com os arquvis
        String[] filmes = new String[quantidade_catalogo];

        //Entrada do nome do arquivo no vetor filmes[]
        for(int i = 0;i< filmes.length; i++) {
            System.out.print("Qual o nome do arquivo:");
            String nomeArquivo = leituraTeclado.nextLine();
            filmes[i] = nomeArquivo;
        }
        BufferedReader plataformaTodo = null;

        try {
            for (int i = 0; i < filmes.length; i++) {
                FileReader arquivoPlataforma = new FileReader(filmes[i]);
                plataformaTodo = new BufferedReader(arquivoPlataforma);
                String linhaPlataforma = plataformaTodo.readLine();
                System.out.println(linhaPlataforma);
                int processo = 0;
                while (linhaPlataforma != null) {
                    if (processo == 0) {
                        linhaPlataforma = plataformaTodo.readLine();
                        Filme linhaLeitura = new Filme(linhaPlataforma);

                        System.out.print(linhaLeitura);
                        processo = processo + 1;
                    } else {
                        linhaPlataforma = plataformaTodo.readLine();
                        System.out.print(linhaPlataforma);
                    }

                }
                //fechamento do arquivo
                plataformaTodo.close();

            }
            } catch(Exception erro){
                //Vai tratar o erro.
                System.out.print("Deu ruim");
                System.out.println(erro.getMessage());
            }
        }









}