package Sistema_funcionarios;

public class FuncionarioCLT extends Funcionario{
    public double bonus;

    public FuncionarioCLT(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    //Sobrecrita (polimorfismo)
    @Override
    public double calcularPagamento(){
        return salarioBase + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
