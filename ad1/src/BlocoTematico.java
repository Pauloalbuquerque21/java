public class BlocoTematico extends Bloco{
    private String temaDesfile;

    public BlocoTematico(int tamanho){
        super(tamanho);
    }

    public void setDesfile(String tema_desfile){
        this.temaDesfile = tema_desfile;
    }

}
