package imprementando_heranca_na_pratica;

public class Main {
    public static void main(String[] args){
        Panda panda = new Panda(10);
        panda.setNome("Panda");
        panda.setIdade(50);
        System.out.println("Nome: " + panda.getNome());


        Hipopotamo hipopotamo = new Hipopotamo(10,2);
        hipopotamo.setIdade(50);
        hipopotamo.imprimirDados();
    }
    
}
