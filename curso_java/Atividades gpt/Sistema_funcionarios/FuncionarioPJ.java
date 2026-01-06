package Sistema_funcionarios;

public class FuncionarioPJ extends Funcionario{
    public int horasTrabalhadas;
    public double valorHora;

    //Não precisa colocar o double salarioBase, pois a class filha não precisa desse parâmetro
    public FuncionarioPJ(String nome, int horasTrabalhadas, double valorHora) {
        //O "0" é usado, pois na class pai existe o parâmetro salarioBase, se a class filha não precisar
        //vamos ter que definir o valor, nesse caso é o zero.
        super(nome,0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    //Sobrescrita(polimorfismo)
    @Override
    public double calcularPagamento(){
        return salarioBase * valorHora;
    }
}
