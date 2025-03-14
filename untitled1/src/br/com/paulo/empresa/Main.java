package br.com.paulo.empresa;

public class Main {
    public static void main(String[] args){
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setSalario(1500);
        tecnico.setCpf("01234567890");

        tecnico.impremirRemuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerentão");
        gerente.setSalario(3000);
        gerente.setCpf("9876543210");

        gerente.imprimirRemuneracao();
    }
}
