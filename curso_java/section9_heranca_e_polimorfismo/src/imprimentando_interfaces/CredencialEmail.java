package imprimentando_interfaces;

public class CredencialEmail implements Autenticacao {

    @Override
    public String getIdentificacao(){
        return null;
    }

    @Override
    public String getSenha(){
        return null;
    }

    @Override
    public boolean isUsaSenha(){
        return false;
    }
}
