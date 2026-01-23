package conteudo_streaming;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Jogos vorazes", 2,"Gary Ross");
        Serie serie = new Serie("Naruto",1,10);
        filme.reproduzir();
        serie.reproduzir();

        PlataformaStreaming armazenar = new PlataformaStreaming();

        armazenar.AddConteudo(filme);
        armazenar.AddConteudo(serie);
    }
}
