package arquivos;
import java.io.*;

public class leitura {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\paulo\\OneDrive\\Documentos\\testando.txt"));

        String texto = br.readline();

        System.out.println(texto);

        br.close();



    }
}
