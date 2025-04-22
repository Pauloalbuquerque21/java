import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        //Entrada para quantas plataformas
        System.out.print("Quantas plataformas serão cadastradas?");
        int quantidade_catalogo = leituraTeclado.nextInt();

        //Array com os arquvis
        String[] filmes = new String[quantidade_catalogo];

        //Entrada do nome do arquivo
        for(int i = 0;i< filmes.length; i++) {
            System.out.print("Qual o nome do arquivo:");
            leituraTeclado.nextLine();
            String nomeArquivo = leituraTeclado.nextLine();
            filmes[i] = nomeArquivo;
        }
        BufferedReader plataformaTodo = null;

        try {
            for(int i = 0;i<filmes.length;i++){
                FileReader arquivoPlataforma = new FileReader(filmes[i]);
                plataformaTodo = new BufferedReader(arquivoPlataforma);
                String linhaPlataforma = plataformaTodo.readLine();
                System.out.println(linhaPlataforma);
                while(linhaPlataforma != null){
                    linhaPlataforma = plataformaTodo.readLine();
                    System.out.println(linhaPlataforma);
                    }
            }

        } catch(Exception erro){
            //Vai tratar o erro.
            System.out.print("Deu ruim");
            System.out.println(erro.getMessage());
        }





    }
}