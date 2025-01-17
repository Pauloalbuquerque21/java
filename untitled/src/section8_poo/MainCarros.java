package section8_poo;


public class MainCarros {
    public static void main(String[] args) {
        //A tipo é a class Carros
        Carros punto = new Carros();
        // atributo cavalos recebe o valor 100, o atributo cavalos da variavel punto é 100
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Automatica";
        punto.modelo = "punto";

        Carros civic = new Carros();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Manual";


        System.out.println("Dados do punto:");
        System.out.println("O Carro: "+punto.modelo+" tem "+punto.cavalos+" cavalos.");
    }
}
