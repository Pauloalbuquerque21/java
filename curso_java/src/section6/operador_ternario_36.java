package section6;

public class operador_ternario_36 {
    public static void main(String[] args) {
        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;

        if(idade > idadeMinima && anoNascimento >= 2000 && idadeMinima <20){
            System.out.println("Executa o IF com a lógica do E");
        }

        if(idade > idadeMinima || anoNascimento >= 2000){
            System.out.println("Execute esse lógica do OU");
        }
        //Esse é um exemplo de operador ternário, se por acaso a condição for verdade mostrará a primeira afirmação,
        //Mas se ela estiver errada será a segunda afirmação
        String deMaior = idade >= 18 ? "Sim, é de maior" : "Não, é de menor";
        System.out.println(deMaior);
    }
}
