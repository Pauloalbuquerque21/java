package conteudo_streaming;

public class Filme extends Conteudo {
    private String diretor;

    public Filme(String titulo, int duracao, String diretor){
        this.diretor = diretor;
        super(titulo,duracao);
    }
}
