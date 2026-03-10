package Sistema_gestao_jiu_jitsu;

public class Aluno extends Praticante implements AptoCompeticao{
    private String nomeProfessor;

    public void getNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String setNomeProfessor(){
        return this.nomeProfessor;
    }

    @Override
    public void exibirDetalhes(){
        System.out.print("Nome: "+setNome()+"\nIdade: "+setIdade()+"\nFaixa: "+setFaixa()+"\nnomeProfessor: "+setNomeProfessor());
    }

    public void fazerAquecimento(){
        System.out.print("Aluno "+nome+" fazendo drills de aquecimento.");
    }
}