package estudo.files;

//
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class CriadorArquivo {
    public static void main(String[] args) {

        try{
            //Usamos o "File para apontar onde o arquivo vai ser criado
            File arquivo = new File("C:\\Usuários\\paulo\\OneDrive\\Documentos");

            //FileWriter abre uma coneção de escrita com o arquivo criado.
            FileWriter fileWriter = new FileWriter(arquivo);

            // Vai criar um espaço temporário na memória RAM para a escrita.
            // Após isso, você poderá usar os métodos dessa classe e irá armazenar essas
            // informações na RAM. Quando o buffer estiver cheio ou você mandar, ele descarrega
            // todas as informações no disco.
            BufferedWriter writer = new BufferedWriter(fileWriter);

            //É um método da class BufferedWriter. Tem como objetivo escrever
            //informações no buffer, criado na ram.
            writer.write("Conteudo do novo arquivo.");

            //Flush é o metodo que informa o momento de descarregar as informações
            //que estão no buffer para disco.
            writer.flush();

            //Este método encerra a comunicação com o sistema operacional
            //e libera o arquivo para que outros programas passam usá-lo.
            //obs:O close() chama o flush() automaticamente antes de fechar.
            writer.close();

        }catch(Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }



    }
}
