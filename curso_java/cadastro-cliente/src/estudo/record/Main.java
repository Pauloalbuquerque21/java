package estudo.record;

public class Main {
    public static void main(String[] args){
        //Essa é uma class, logo tem set e get.
        //Se vc quiser acessar e modificar, você usa o set, mas se quiser só acessar para atribuir para
        //uma variável. Pode usar o get.
        var pessoa = new Pessoa("Fulano","0123");
        String nome = pessoa.getNome();


        //Já o record não, só tem o get e ficar assim nome(), não fica getNome e não tem set.
        var pessoaRecord = new PessoaRecord("Nome","Cpf");
        String nomePessoaRecord = pessoaRecord.nome();


    }
}
