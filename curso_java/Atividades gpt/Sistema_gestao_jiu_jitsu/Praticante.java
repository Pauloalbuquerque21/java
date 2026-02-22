package Sistema_gestao_jiu_jitsu;

public abstract class Praticante {
    public String nome;
    private int idade;
    private String faixa;

    public void exibirDetalhes(){
        System.out.print("Nome:"+nome+"\nIdade:"idade+"Faixa:"+faixa);
    }

}

public class Aluno extends Praticante implements AptoCompeticao{
    private String nomeProfessor;
    @Override
    public void exibirDetalhes(){
        System.out.print("");
    }

    public void fazerAquecimento(){
        System.out.print("Aluno "+nome+" fazendo drills de aquecimento.");
    }
}

public class Professor extends Praticante{
    private String grouNaFaixaPreta;
    @Override
    public void exibirDetalhes(){
        System.out.print("");
    }
}

public interface AptoCompeticao {
    void fazerAquecimento();
}