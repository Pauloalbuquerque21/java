import java.util.ArrayList;

public class Catalogo extends  Filme{
    private ArrayList<String> strimes;
    //atributo com o nomero de filmes de cada strime
    private ArrayList<Integer> numeroFilmes;

    public Catalogo(){
        this.strimes = new ArrayList<String>();
        this.numeroFilmes = new ArrayList<Integer>();
    }

    public void adicionarCatalogo(String nome){
        strimes.add(nome);
    }

    //metodo que imprime cada strime
    public void imprimirVetornumeroFilmes(){
        System.out.print(numeroFilmes);
    }


    //Adionar o nome de filmes e cada strime
    public void adicionarnumeroFilmes(int vezes){
        numeroFilmes.add(vezes);
    }

    public void mostrarFilmesGenero(String generoFilme){
        int quantidadeStrimes = strimes.size();
        for(int selecionarStrime = 0;selecionarStrime < quantidadeStrimes;selecionarStrime++) {
            System.out.print(strimes.get(selecionarStrime));
            if(selecionarStrime == 0){
                for(int qualFilme = 0; qualFilme < numeroFilmes.get(selecionarStrime); qualFilme++){
                    if(generoFilme.equals(genero.get(qualFilme))){
                        System.out.print("Apareceu");
                    }

                }


        }
        }
    }



}
