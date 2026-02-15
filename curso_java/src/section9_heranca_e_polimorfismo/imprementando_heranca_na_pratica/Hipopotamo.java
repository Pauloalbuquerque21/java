package section9_heranca_e_polimorfismo.imprementando_heranca_na_pratica;

public class Hipopotamo {
    private int forcaMordida;

    public void ficarNaAgua(){
        System.out.println("Estou na água...");
    }

    public int getForcaMordida(){
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida){
        this.forcaMordida = forcaMordida;
    }
}
