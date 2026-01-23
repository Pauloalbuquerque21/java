package conteudo_streaming;

public class Filme extends Conteudo {
    private String diretor;

    public Filme(String titulo, int duracao, String diretor){
        super(titulo,duracao);
        this.diretor = diretor;
    }
    @Override
    public void reproduzir(){
        System.out.println("Reproduzir filme: "+getTitulo()+" dirigido por "+diretor);
    }
}
