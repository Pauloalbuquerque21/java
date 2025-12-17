package sobrescrita_de_metodos_nas_subclasses;

public class Gerente extends Funcionario {

    @Override
    public double bonificacao() {
        double bonificacaoPadrao = super.bonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }
}
