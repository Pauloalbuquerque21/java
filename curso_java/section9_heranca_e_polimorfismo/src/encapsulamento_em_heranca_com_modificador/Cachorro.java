package encapsulamento_em_heranca_com_modificador;

import imprementando_heranca_na_pratica.Animal;

public class Cachorro extends Animal{
    /*
    Quando a class pai tem um construtor as classes filhas tem
    que ter um construtor e usar a palavra reservada super()

     */
    public Cachorro (int idade){
        super("Mel",idade);
    }

    public void latir(){
        imprimirDados();
    }
}
