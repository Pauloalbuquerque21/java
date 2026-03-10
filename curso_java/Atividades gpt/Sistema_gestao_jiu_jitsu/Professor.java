package Sistema_gestao_jiu_jitsu;


public class Professor extends Praticante{
    private String grouNaFaixaPreta;
    @Override
    public void exibirDetalhes(){
        System.out.print("Nome: "+nome+"\nIdade: "+idade+"\nFaixa: "+faixa+"\nGrau da Faixa:"+grouNaFaixaPreta);
    }
}
