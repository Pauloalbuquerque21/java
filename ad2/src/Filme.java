import java.util.ArrayList;

public class Filme {
    private ArrayList<String> titulo;
    private ArrayList<String> genero;
    private ArrayList<Integer> duracao;

    public Filme(){
        this.titulo = new ArrayList();
        this.genero = new ArrayList();
        this.duracao = new ArrayList();

    }



    public void adicionarDuracao(int tempo){
        duracao.add(tempo);
    }

    public void imprimirVetorDuracao(){
        System.out.print(duracao);
    }

    public void adicionarGenero(String tipo){
        genero.add(tipo);
    }

    public void adicionarTitulo(String nome){

        titulo.add(nome);
    }



}
