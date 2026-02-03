package relatorio_financeiros;

public class Main {
    public static void main(String[] args) {
        Escrita_arquivo arquivo = new Escrita_arquivo();
        //arquivo.criarPasta();
        //arquivo.criarArquivo();
        //arquivo.escreverNoArquivo(101,"Mouse Gamer",120.50,2);
        arquivo.lerArquivo();

    }
}
