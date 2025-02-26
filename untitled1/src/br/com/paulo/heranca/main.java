package br.com.paulo.heranca;


public class main {
    public static void main(String[] args) {
        Panda panda = new Panda();

        Cachorro cachorro = new Cachorro;

        panda.setNome("Panda");

        System.out.println(panda.getNome());

        Hipopotamo hipopotamo = new Hipopotamo();

        hipopotamo.setNome("Hipopotamo");

        System.out.println(hipopotamo.getNome());

        System.out.println("Som do panda");
        panda.latir("aiai");
        System.out.println("Som do "+hipopotamo.getNome());
        hipopotamo.latir("vovo");



    }

}
