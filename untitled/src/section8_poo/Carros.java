package section8_poo;
//Class: Carros, Atributos:cavalos,cor,transmissão e montadora
public class Carros {
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    String modelo;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

    //Metodo:comportamento da class
    //Esse metódo, seria para abastecer
    void abastecer(int litros){
        combustivel = combustivel + litros;
    }

    //Esse método ele retorna um valor, logo temos que colocar o tipo, por isso que coloquei "int"
    int autonomiaCombustível(){
        int autonomia = combustivel * kmPorLitros;
        return autonomia;
    }



}
