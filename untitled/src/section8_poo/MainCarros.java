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
        punto.combustivel = 20;
        punto.modelo = "punto";
        punto.capacidadeTanque = 100;
        punto.kmPorLitros = 10;


        Carros civic = new Carros();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Manual";
        civic.combustivel = 0;
        civic.modelo = "civic";
        civic.capacidadeTanque = 70;
        civic.kmPorLitros = 12;


        System.out.println("Dados do punto:");
        System.out.println("O Carro: "+punto.modelo+" tem "+punto.cavalos+" cavalos.");

        //Método abastecimento, para encher o tanque.
        civic.abastecer(100);

        System.out.println("O Carro: "+civic.modelo+" tem de combustível "+civic.combustivel);
        System.out.println("O Carro: "+punto.modelo+" tem de combustível "+punto.combustivel);

        //Método para mostrar a autonomia
        System.out.println("O Carro: "+punto.modelo+" tem de autonomia "+punto.autonomiaCombustivel());
        System.out.println("O Carro:"+civic.modelo+" tem de autonomia "+civic.autonomiaCombustivel());

        //
    }
}
