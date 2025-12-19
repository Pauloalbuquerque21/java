package cadastro_pessoa;

public class Main {
    public static void main(String[] args){

        Pessoa[] pessoa = new Pessoa[6];

        pessoa[0] = new Aluno("Ana",20,"ADS");
        pessoa[1] = new Professor("Bruno",40,5000.0);
        pessoa[2] = new Funcionario("Carlos",30,"RH");
        pessoa[3] = new Aluno("Diego",22,"SI");
        pessoa[4] = new Professor("Eva",45,7200.0);
        pessoa[5] = new Funcionario("Felipe",28,"TI");

        for(Pessoa p : pessoa){
            System.out.println(p.getDescricao());
        }

    }
}
