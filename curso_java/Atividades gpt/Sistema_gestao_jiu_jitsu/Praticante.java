package Sistema_gestao_jiu_jitsu;

public abstract class Praticante {
    private String nome;
    private int idade;
    private String faixa;

    public void exibirDetalhes(){
        System.out.print("Nome:"+nome+"\nIdade:"idade+"Faixa:"+faixa);
    }

}

public class Aluno extends Praticante{
    private String nomeProfessor;
    @Override
    public void exibirDetalhes(){
        System.out.print("");
    }
}

public class Professor extends Praticante{
    private String grouNaFaixaPreta;
    @Override
    public void exibirDetalhes(){
        System.out.print("");
    }
}
