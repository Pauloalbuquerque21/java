package Sistema_funcionarios;

public class FuncionarioPJ extends Funcionario{
    public int horasTrabalhadas;
    public double valorHora;

    public double calcularPagamento(){
        return salarioBase * valorHora;
    }
}
