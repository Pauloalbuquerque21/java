package Sistema_gestao_jiu_jitsu;

public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.getNome("Carlos");
        aluno.getIdade(21);
        aluno.getFaixa("Azul");
        aluno.getNomeProfessor("Matheus Costa");
        aluno.exibirDetalhes();



    }
}
