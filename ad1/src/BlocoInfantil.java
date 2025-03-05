
public class BlocoInfantil extends Bloco{
    private int faixaEtariaFim;
    private int faixaEtariaInicio;



    public BlocoInfantil(int tamanho){
        super(tamanho);
    }

    public void setFaixaEtaria(int inicio, int fim){
        this.faixaEtariaFim = fim;
        this.faixaEtariaInicio = inicio;

    }
}
