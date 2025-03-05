public class Bloco {
    private String nome;
    private String estiloMusica;
    //vão ser várias opções em número.
    private int bairro;
    private int diaEvento;
    private int mesEvento;
    private int numeroFolioesAnterior;
    private int[] horarios;
    private String[] blocos;

    //Construtor para dos vetores
    public Bloco(int tamanho){
        //Essa parte int[tamanho] é por que as informações que serão recebidas, serão ints
        this.horarios = new int[tamanho];
        //Essa parte String[tamanho] é por que as informações que serão recebidas, serão strings
        this.blocos = new String[tamanho];
    }



    //vou fazer um array com as opções de bairros.

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setHorarios(int valor, int posicao){
        this.horarios[posicao] = valor;

    }
    // no get você tem que colocar int, antes do getHorários, para definir o tipo de retorno
    public int getHorarios(int posicao){
        return this.horarios[posicao];
    }

    public

    public void Horarios(){
        System.out.print("Horário Armazenados:");
        for(int i=0; i<=13;i= i + 1){
            System.out.print(horarios[i]);
            if(i<horarios.length - 1) {
                System.out.print(" | ");
                }
            }
        System.out.println();
        }
    }



