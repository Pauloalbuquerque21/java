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
        //Outra opções:
        //DISPOSE_ON_CLOSE : fecha só a janela
        //DO_NOTHING_ON_CLOSE: Ignora o clique
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Diz para o Swing que você vai definir manualmente a posição dos componentes
        setLayout(null);
        //Torna a janela visível na tela.
        setVisible(true);



    }

    private void criarComponentes(){

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,80,20);
        add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20,40,200,25);
        add(campoNome);

        JLabel labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20,70,80,20);
        add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20,90,200,25);
        add(campoCpf);

        JLabel labelSexo = new JLabel("Sexo:");
        //Posicionando o rótulo
        labelSexo.setBounds(20,120,80,20);
        //adicionando o rótulo na janela
        add(labelSexo);

        //Criando a caixa de seleção
        //Tipo dos itens(enum)
        //TipoSexo.values() → retorna [M, F, O]
        campoSexo = new JComboBox<>(TipoSexo.values());
        campoSexo.setBounds(20,140,200,25);
        add(campoSexo);

        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(240,40,100,30);
        add(botaoSalvar);

    }


    public static void main(String[] args) {
        new TelaCadastro();
    }


}
