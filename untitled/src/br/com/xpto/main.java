package br.com.xpto;
/*
import br.com.xpto.concessionaria.Pessoa;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        String rg = pessoa.getRg();

    }
}
*/


public class main{
    public static void main(String[] args){
        br.com.xpto.concessionaria.Pessoa pessoa = new br.com.xpto.concessionaria.Pessoa();
        pessoa.setRg("123456789");

        System.out.println(pessoa.getRg());

        br.com.xpto.sistema.Pessoa pessoa2 = new br.com.xpto.sistema.Pessoa();

        pessoa2.setCpf("123456789-10");

        System.out.println(pessoa2.getCpf());

    }
}