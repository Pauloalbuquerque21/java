package Sistema_funcionarios;

public class FuncionarioCLT extends Funcionario{
    public double bonus;

    @Override
    public double calcularPagamento(){
        return salarioBase + bonus;
    }
}
