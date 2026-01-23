package conteudo_streaming;

public class Serie extends Conteudo{
    private int Quant_temporada;

    public Serie(String titulo,int duracao,int Quant_temporada){
        super(titulo,duracao);
        this.Quant_temporada = Quant_temporada;
    }

    public int getQuanti_temporada(){
        return Quant_temporada;
    }

    @Override
    public void reproduzir(){
        System.out.println("Maratonando série: "+getTitulo()+" com "+Quant_temporada+" temporadas.");
    }

}
