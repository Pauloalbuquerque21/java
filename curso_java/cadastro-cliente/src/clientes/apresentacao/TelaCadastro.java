package clientes.apresentacao;

import javax.swing.*;

public class TelaCadastro extends JFrame{

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<String> campoSexo;

    public TelaCadastro(){
        construirTela();
    }

    private void construirTela(){
        setSize(600,500);
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarCamponentesFotos();
    }

    private void adicionarCampos(){
        //Cria um texto "Nome:" para exibir na tela
        labelNome = new JLabel("Nome:");
        //Definir a posição e otamanho do  compoente
        labelNome.setBounds(20,20,200,20);
        //Adicione o texto "Nome:" denro da janela
        getContentPane().add(labelNome);

        //Cria uma caixa de texto em branco
        campoNome = new JTextField();
        //Definir a posição e o tamanho do  compoente
        campoNome.setBounds(20,40,200,20);
        //Adicione a caixa de texto denro da janela
        getContentPane().add(campoNome);

        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20,60,200,20);
        getContentPane().add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20,80,200,20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20,100,200,20);
        getContentPane().add(labelSexo);

        //Array
        String[] tipoSexo = {"M","F","0"};
        //Cria um campo de seleção (combo box) e preencha
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(20,120,200,20);
        getContentPane().add(campoSexo);



    }

    private void adicionarBotoes(){

    }

    private void adicionarCamponentesFotos(){

    }
}


