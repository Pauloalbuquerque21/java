public class Bloco {
    private String nome;
    private String estiloMusica;
    //vão ser várias opções em número.
    private int bairro;
    private int diaEvento;
    private int mesEvento;
    private int numeroFolioesAnterior;
    private int[] horarios;

    //Construtor
    public Bloco(int tamanho){
        this.horarios = new int[tamanho];
    }

    //vou fazr um array com as opções de bairros

    public void setNome(String nome){
        this.nome = nome;
    }

    /*public void setHorarios(int valor, int posicao){
        this.horarios[posicao] = valor;
    }

    public getHorários(){
        return horarios;
    }
    */

}
