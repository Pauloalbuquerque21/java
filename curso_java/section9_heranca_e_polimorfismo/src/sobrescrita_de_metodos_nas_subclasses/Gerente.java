package sobrescrita_de_metodos_nas_subclasses;

public class Gerente extends Funcionario {
    /*
       sobrescrita seria o ato de pegar o método da class pai e modificar sobreescrevendo
     */
    @Override
    public double bonificacao() {
        /*
        usamos esse "super." para usar o método da class pai, se houvesse um método
        "bonificacao" na class Gerente e quiséssemos usar esse método nessa class
        apenas escrevia assim "double bonificacaoPadrao = bonificacao();"
         */
        double bonificacaoPadrao = super.bonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }

    /*
    //nesse caso é uma sobrecarca pois tem um parametro

    public double bonificacao(int maisValor) {
        double bonificacaoPadrao = super.bonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }
    */
}
