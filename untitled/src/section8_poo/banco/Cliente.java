package section8_poo.banco;

public class Cliente {
    //propriedades
    public String cpf;
    public String nome;
    //Isso é um construtur
    public Cliente(String cpf,String nome){
        //Usamos "this." quando queromos referênciar a variavel a variavel global.
        //Nesse caso,o this. essa recebendo o valor do variavel cpf do construtor e atribuindo a variavel global da class
        this.cpf = cpf;
        this.nome = nome;
    }


}
