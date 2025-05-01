import java.util.ArrayList;

public class Catalogo {
    private ArrayList<String> strimes;

    public Catalogo(){
        this.strimes = new ArrayList();
    }

    public void adicionarCatalogo(String nome){
        strimes.add(nome);
    }

}
