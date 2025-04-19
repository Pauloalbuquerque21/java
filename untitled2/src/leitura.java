import java.io.*;

public class leitura {
    public static void main(String[] args){
        try {
            // BufferedReader é um class para leitura de arquivo
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\paulo\\OneDrive\\Documentos\\testando.txt"));

            String texto = br.readLine();

            System.out.println(texto);

            br.close();
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }



    }
}