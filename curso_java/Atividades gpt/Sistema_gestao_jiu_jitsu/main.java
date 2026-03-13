package Sistema_gestao_jiu_jitsu;

public class main {
    public static void main(String[] args) {

        //Instanciando e definindo as variáveis da class Aluno
        Aluno aluno = new Aluno();
        aluno.getNome("Carlos");

        //Tratamento de erro:
        try{
            aluno.getIdade(21);
            System.out.println("Idade definida com sucesso!");
        } catch(IdadeInvalidaException e) {
            //Se o erro acontecer, o Java pula para cá em vez de travar o programa
            System.out.println("Erro ao cadastrar:"+e.getMessage());
        }

        aluno.getFaixa("Azul");
        aluno.getNomeProfessor("Matheus Costa");
        aluno.exibirDetalhes();
        aluno.fazerAquecimento();

        //Instanciando e definindo as variáveis da class professor
        Professor professor = new Professor();
        professor.getNome("Matheus Costa");
        //professor.getIdade(40);
        professor.getFaixa("Preta");
        professor.getGrauNaFaixaPreta(2);
        professor.exibirDetalhes();

    }
}
