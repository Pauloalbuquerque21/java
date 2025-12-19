package cadastro_pessoa;

public class Aluno extends Pessoa {
    public String curso;

    public Aluno(String nome,int idade,String curso){
        super(nome,idade);
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" - Aluno - Curso: "+ curso;
    }
}
