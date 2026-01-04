package cadastro_cliente;

import javax.swing.*;

public class TelaCadastro extends JFrame{

    private JTextField campoNome;


    public TelaCadastro(){
        setSize(400,250);
        setTitle("Cadastro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaCadastro();
    }
}
