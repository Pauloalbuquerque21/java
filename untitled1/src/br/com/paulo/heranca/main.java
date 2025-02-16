package br.com.paulo.heranca;

public class main {
    public static void main(String[] args) {
        Panda panda = new Panda();

        panda.setNome("Panda");

        System.out.println(panda.getNome());

        Hipopotamo hipopotamo = new Hipopotamo();

        hipopotamo.setNome("Hipopotamo");

        System.out.println(hipopotamo.getNome());

    }

}
