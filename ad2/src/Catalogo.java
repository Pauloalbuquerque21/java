import java.util.ArrayList;

public class Catalogo {
    private ArrayList<String> strimes;
    //atributo com o nomero de filmes de cada strime
    private ArrayList<Integer> numeroFilmes;

    public Catalogo(){
        this.strimes = new ArrayList();
        this.numeroFilmes = new ArrayList()
    }

    public void adicionarCatalogo(String nome){
        strimes.add(nome);
    }

    //metodo que imprime cada strime
    public void imprimirVetornumeroFilmes(){
        System.out.print(numeroFilmes);
    }

    public void adicionarnumeroFilmes(int vezes){
        numeroFilmes.add(vezes);
    }



}
