package section8_poo.carro;
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
        int quantidadeSuficiente=0;
        if(litros+combustivel >capacidadeTanque){
            quantidadeSuficiente = capacidadeTanque - combustivel;
            combustivel = combustivel + quantidadeSuficiente;
            System.out.println("Quantidade abastecida: "+quantidadeSuficiente+", pois quantidade sugerida ultrapassa.");
        }
        else{
            combustivel = combustivel + litros;
            System.out.println("Quantidade: "+litros+" tem espaço no tanque.");
        }
    }

    //Esse método ele retorna um valor, logo temos que colocar o tipo, por isso que coloquei "int"
    int autonomiaCombustivel(){
        int autonomia = combustivel * kmPorLitros;
        return autonomia;
    }



}
