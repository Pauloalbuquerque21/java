package estudo.inferenciatipos;

import clientes.dominio.Cliente;

public class Main {
    public static void main(String[] args){
        int numero = 10;
        double flutuante;
        flutuante = 10d;

        //No lugar de declarar que a variavel é do tipo int, só colocar var e ele já vai assumir que a variavel "outroNumero" é do tipo int
        var outroNumero = 15;

        //No lugar de declarar que a variavel é do tipo Cliente, só colocar var.
        var cliente = new Cliente();
    }
}
