package estudo.strings;

public class Main {
    static String valor = "A lebre é branca";

    public static void main(String[] args) {
        tamanhoString();
        trabalhandoComSubstring();
        pegarCaracteres();
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
}
