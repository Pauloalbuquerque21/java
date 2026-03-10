package Sistema_gestao_jiu_jitsu;

public class main {
    public static void main(String[] args) {

        //Instanciando e definindo as variáveis da class Aluno
        Aluno aluno = new Aluno();
        aluno.getNome("Carlos");
        aluno.getIdade(21);
        aluno.getFaixa("Azul");
        aluno.getNomeProfessor("Matheus Costa");
        aluno.exibirDetalhes();

        //Instanciando e definindo as variáveis da class professor
        Professor professor = new Professor();
        professor.getNome("Matheus Costa");
        professor.getIdade(40);
        professor.getFaixa("Preta");
        professor.getGrauNaFaixaPreta(2);
        professor.exibirDetalhes();

    }
}
