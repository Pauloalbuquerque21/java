package imprementando_heranca_na_pratica;

public class Panda extends Animal{
    private String cor;
    private String corSecundaria;

    public Panda(){
        super("Urso");
    }

    public void subirArvore(){
        System.out.println("Subindo...");
    }
    
    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

}
