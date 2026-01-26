package estudo.strings;

public class Main {
    static String valor = "A lebre é branca";

    public static void main(String[] args) {
        replace();

        String hello = "Hello";
        //Esse é para ver se é parecido.
        System.out.println("Parece com hello: " + hello.equalsIgnoreCase("hello"));
        //Uso quando é igual.
        System.out.println("Parece com hello: " + hello.equals("hello"));
        //Ver se começa com He
        System.out.println("Começa com He?: " + hello.startsWith("He"));
        //Ver se termina com Lo
        System.out.println("Começa com Lo?" + hello.endsWith("Lo"));

        //Seperar pelo conteudo definido, no caso, o " ".
        String nomeCompleto = "Fulano da silva sauro";
        String[] partesDoNome = nomeCompleto.split(" ");
        System.out.println(partesDoNome[0]);
        System.out.println(partesDoNome[1]);
        System.out.println(partesDoNome[2]);
        System.out.println(partesDoNome[3]);
    }

    private static void tamanhoString(){
        int tamanho = valor.length();
    }

    private static void pegarCaracteres(){
        //O charAt pega a posição, no caso a posição 0.
        char caractere = valor.charAt(0);
        //char é um tipo de dado que lida com um unico caractere.
        char ultimo = valor.charAt(valor.length()-1);
        System.out.println("Primeiro e ultimo Caractere:" + caractere + " e " + ultimo);
    }

    private static void trabalhandoComSubstring(){
        //String pedaco = valor.substring(1); "corta a string a parti do 1, ou seja,  lebre é branca "
        //String pedaco = valor.substring(0,3);" vai começar do 0 e corta a 3
        String pedaco = valor.substring(1);
        String pedaco2 = valor.substring(0,3);
        System.out.println("Pedaço da string " + pedaco);
        System.out.println("Pedaço2 da string " + pedaco2);
    }

    private static void exemploIndexOf(){
        //Esse método indexOf é para encontra o objeto e informa a posição dele na string
        int indice = valor.indexOf("R");
        System.out.println("Indice letra a: " + indice);

        String nome = "Pedro da silva";

        //-1 -> valor não encontrado na string
        indice = valor.indexOf("Silva");

        System.out.println("Indice encontrado: " + indice);

        if(nome.indexOf("Pedro") != -1){

        } else {
            System.out.println("Não encontrei esse pedaço no nome.");
        }
    }

    private static void exemplosCase(){
        String string = "Silva";

        String caixaAlta = string.toUpperCase();

        System.out.println("Caixa alta: "+ caixaAlta);

        String caixaBaixa = string.toLowerCase();

        System.out.println("Caixa baixa: " + caixaBaixa);
    }

    private static void removerespacosEmBranco(){

        String string = "    Pedro da silva     ";

        //apaga espaço antes e depois da string
        String stringSemOsEspacos = string.trim();
        System.out.println(stringSemOsEspacos.length());
        System.out.println(stringSemOsEspacos);

    }

    private static void replace(){
        String valor_replace = "Maçã";

        String novaMaca = valor_replace.replace("ã","a").replace("ç","c");
        System.out.println(novaMaca);

        String cpf = "123.456.789-03";

        String cpf2 = cpf.replace(".","").replace("-","");
        System.out.println(cpf2);

    }


}
