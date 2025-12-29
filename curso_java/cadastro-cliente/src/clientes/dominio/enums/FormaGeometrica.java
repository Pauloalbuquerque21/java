package clientes.dominio.enums;

public enum FormaGeometrica {

    //Toda vez que colocar um valor, tem que ser criar uma propriedade
    //no caso do número a propriedade é "lados" e o nome a propriedade é "descricao"
    QUADRADO(4,"Quadrado"),
    CIRCULO(0,"Circulo"),
    TRIANGULO(3,"Triangulo"),
    RETANGULO(4,"Retangulo");

    //private → só o próprio enum acessa diretamente
    //final → o valor não pode mudar depois que for definido
    //int lados → o atributo que vai armazenar a quantidade de lados
    private final int lados;
    private final String descricao;


    public FormaGeometrica(int lados, String descricao){
        this.lados = lados;
        this.descricao = descricao;
    }

}
