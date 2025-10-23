package arquivos;
import java.io.*;

public class leitura {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\paulo\\OneDrive\\Documentos\\testando.txt";
        //Função: A classe BufferedReader é utilizada para ler arquivos de forma mais eficiente. Ela usa um buffer (área de armazenamento temporário) para ler os dados de uma vez e reduzir o número de leituras feitas diretamente no arquivo. Ela melhora a performance da leitura, pois lê dados em blocos.
        //Objetivo: A linha acima usa o BufferedReader para envolver o FileReader e melhorar a leitura do arquivo. O objeto leitor agora pode ler o conteúdo do arquivo de maneira mais eficiente.
        BufferedReader leitor = null;
        try {
            //Todo o código responsável por ler o arquivo
            //A classe FileReader é usada para ler caracteres de um arquivo.
            //Objetivo: A linha acima cria um objeto leitorArquivo que vai ler o arquivo localizado no caminho
            //caminhoArquivo, que é um caminho absoluto para o arquivo "testando.txt". FileReader lê o
            //arquivo de forma simples, caractere por caractere, e prepara os dados para serem lidos por outra classe.
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);
            //Função: O método readLine() da classe BufferedReader é utilizado para ler uma linha do arquivo. Ele retorna a linha lida como uma String.
            //Objetivo: Esse comando lê uma linha do arquivo e armazena essa linha na variável linha. Esse método pode ser chamado várias vezes para ler todas as linhas de um arquivo (uma por vez). Ele retorna null quando não há mais linhas a serem lidas.
            String linha = leitor.readLine();
            System.out.println(linha);

        } catch (Exception erro) {
            //Vai Tratar o erro
            System.out.println("Deu ruim");
            System.out.println(erro.getMessage());

        }

    }

}