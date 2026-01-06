package Sistema_funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //ArrayList do tipo pai
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //Adicionando funcionários misturados
        funcionarios.add(new FuncionarioCLT("Ana",300,500));
        funcionarios.add(new FuncionarioPJ("Bruno",160,30));
        funcionarios.add(new FuncionarioCLT("Carlos",2000,400));
        funcionarios.add(new FuncionarioPJ("Diana",100,35));
        funcionarios.add(new FuncionarioCLT("Eva",3200,600));

        double totalGasto = 0;

        //Percorrendo a Lista

        for (Funcionario f : funcionarios) {

            double pagamento = f.calcularPagamento();
            totalGasto += pagamento;

            System.out.println("Nome " + f.getNome());
            System.out.println("Tipo" + f.getClass().getSimpleName());
            System.out.println("Pagamento: " + pagamento);
            System.out.println("-------------------------------");
        }
        
        System.out.println("Total gasto com pagamentos:" + totalGasto);

    }
}
