package clientes.apresentacao;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import clientes.logicanegocio.Cadastro;
import clientes.logicanegocio.LogicaCadastroClienteFake;


public class TelaCadastro extends JFrame{

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;

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
        TipoSexo[] tipoSexo = {null, TipoSexo.M, TipoSexo.F, TipoSexo.O};
        //Cria um campo de seleção (combo box) e preencha
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(20,120,200,20);
        getContentPane().add(campoSexo);



    }

    private void adicionarBotoes(){
        //Cria um botão "Salvar" para exibir na tela
        botaoSalvar = new JButton("Salvar");
        //Definir a posição e o tamanho do  Botão
        botaoSalvar.setBounds(20,160,200,20);

        ActionListener acaoBotaoSalvar = this.botaoSalvarActionListener();
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        //
        //Class anônima
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        //Adicione o botão "Salvar"denro da janela
        getContentPane().add(botaoSalvar);
    }

    private void adicionarCamponentesFotos(){

    }

    private ActionListener botaoSalvarActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo( (TipoSexo) campoSexo.getSelectedItem());

                Cadastro<Cliente> logicaCadastro = new LogicaCadastroClienteFake();
                logicaCadastro.salvar(cliente);

                JOptionPane.showMessageDialog(null, cliente);
            }
        };
    }
}


