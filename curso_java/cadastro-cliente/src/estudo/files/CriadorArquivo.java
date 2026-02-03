package estudo.files;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CriadorArquivo {
    public static void main(String[] args) {
       CriadorArquivo criadorArquivo = new CriadorArquivo();
       criadorArquivo.lerArquivoTexto();
    }

    public void deletarArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\meu_arquivo.txt");
        boolean deletou = arquivo.delete();
        System.out.println("Deletou?" + deletou);
    }

    public void criarPasta(){
        File file = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\pasta");

        //Vai retorna um boolean. True se criou a pasta.Esse é uma método da class File, para criar pasta.
        boolean criou = file.mkdir();
        System.out.println("Pasta croiada? " + criou);
    }

    public void lerArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\meu_arquivo.txt");
        //Alguns métodos da class File
        System.out.println("Caminho: " + arquivo.getAbsolutePath());
        System.out.println("Nome: " + arquivo.getName());
        System.out.println("Caminho: " + arquivo.length());
        System.out.println("Caminho: " + arquivo.isFile());

     }

     public void lerArquivoTexto(){
        try{
            File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\meu_arquivo.txt");

            /*
            O que faz: Tenta abrir uma conexão real com o arquivo físico para leitura de caracteres.

            Comportamento: Se o arquivo não existir exatamente nesse local,
            o Java lançará uma FileNotFoundException (que cai no seu catch).
             */
            FileReader fileReader = new FileReader(arquivo);

            /*
            O que faz: "Envelopa" o fileReader para criar um buffer (uma memória temporária).
            Por que usar: Em vez de ler caractere por caractere do disco (o que é muito lento),
            ele lê blocos inteiros e armazena na RAM, permitindo o uso do método readLine().
            */
            BufferedReader reader = new BufferedReader(fileReader);

            String linha;

            /*
            String linha;: Declara uma variável para guardar temporariamente o texto de cada linha.
            reader.readLine(): Lê o texto até encontrar uma quebra de linha (\n).
            != null: O método retorna null apenas quando chega ao fim do arquivo.
            while: O laço continua repetindo enquanto houver conteúdo para ler.
            */
            while ( (linha = reader.readLine()) != null ) {
                System.out.println(linha);
            }

            reader.close();


        } catch (IOException e) {
            System.out.println("123456");
        }
     }

    public void criarArquivo(){
        try{
            //Usamos o "File para apontar onde o arquivo vai ser criado
            File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\meu_arquivo.txt");

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
