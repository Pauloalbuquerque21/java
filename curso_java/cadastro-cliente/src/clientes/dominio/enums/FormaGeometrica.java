package clientes.dominio.enums;

public enum FormaGeometrica {
    QUADRADO(4),
    CIRCULO(0),
    TRIANGULO(3),
    RETANGULO(4);

    //private → só o próprio enum acessa diretamente
    //final → o valor não pode mudar depois que for definido
    //int lados → o atributo que vai armazenar a quantidade de lados
    private final int lados;

    public FormaGeometrica(int lados){
        this.lados = lados;
    }

}
