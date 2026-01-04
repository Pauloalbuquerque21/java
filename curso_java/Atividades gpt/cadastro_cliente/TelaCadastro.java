package cadastro_cliente;

import javax.swing.*;

public class TelaCadastro extends JFrame{

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;
    private JButton botaoSalvar;


    public TelaCadastro(){
        //Tamanho da janela
        setSize(400,250);
        //Titulo da janela
        setTitle("Cadastro");
        //o que acontece, quando o usuári clica no "X" da tela.
        //Exit_on_close fecha a janela e encerra o programa
        //Outra opções
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setVisible(true);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,80,20);
        add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20,40,200,25);
        add(campoNome);

    }




    public static void main(String[] args) {
        new TelaCadastro();
    }


}
