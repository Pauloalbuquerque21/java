package imprimentando_interfaces;

public class Main {
    public static void main(String[] args){
        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("email@fulano.com","123");

        boolean isAutenticado = autenticador.autenticar(email);

    }


}
