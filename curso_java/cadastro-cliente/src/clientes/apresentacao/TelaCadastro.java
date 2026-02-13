package clientes.apresentacao;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import clientes.logicanegocio.Cadastro;
import clientes.logicanegocio.LogicaCadastroClienteFake;
import clientes.logicanegocio.LogicaCadastroMemoria;
import estudo.exceptions.CpfInvalidoException;
import java.net.URL;
import java.awt.*;

public class TelaCadastro extends JFrame{

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;
    private JLabel labelFoto;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;
    private JButton botaoEscolherFoto;

    private Cadastro<Cliente> logicaCadastro;

    public TelaCadastro(){
        construirTela();
        this.logicaCadastro = new LogicaCadastroMemoria();
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
        //Class-getClass() retorna a classe atual onde o código está rodando.
        //Método-getResource(String path):procura por um arquivo.
        //URL: Armazena o endereço interno onde imagem rh.png foi encontrada. Se o caminho estiver errado, essa variável será null.
        //É uma impementa
        URL localizacao = getClass().getResource("/clientes/apresentacao/rh.png");

        /*
        Transforma a URL encontrada em um objeto ImageIcon,
        que o Java entende como um componente
        gráfico pronto para ser exibido
         */
        ImageIcon imageIcon = new ImageIcon(localizacao);

        //--------Redimensionamento---------
        /*
        getImage(): Extrai a imagem pura de dentro do ícone.
        getScaledInstance(200, 200, ...): Cria uma nova versão da imagem com exatamente 200x200 pixels.
        Image.SCALE_SMOOTH: É um "filtro de qualidade" que garante que a imagem não fique serrilhada ou borrada ao ser redimensionada.
         */
        Image imageRedimensionada = imageIcon.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);

        /*
         imageIcon = new ImageIcon(imageRedimensionada);:
         O Java não consegue exibir o objeto Image direto no rótulo,
         então precisamos "reembalar" a imagem redimensionada de volta
         em um ImageIcon.
        */
        imageIcon = new ImageIcon(imageRedimensionada);

        //labelFoto = new JLabel();: Cria um componente de rótulo vazio.
        labelFoto = new JLabel();

        //labelFoto.setIcon(imageIcon);: "Cola" a imagem redimensionada dentro desse rótulo
        labelFoto.setIcon(imageIcon);
        //labelFoto.setBounds(240, 0, 200, 200);: Define a posição (240 pixels da esquerda, 0 do topo) e o tamanho do rótulo na janela.
        labelFoto.setBounds(240,0,200,200);

        //getContentPane().add(labelFoto);: Adiciona o rótulo com a foto
        // ao painel principal da sua janela para que ela apareça para o usuário.
        getContentPane().add(labelFoto);

        //---------Criação do botão--------
        //Cria um botão com o texto "Alterar Foto"
        botaoEscolherFoto = new JButton("Alterar Foto");

        //Define a posição do botão (logo abaixo da foto) e
        // suas dimensões (160 de largura por 20 de altura).
        botaoEscolherFoto.setBounds(260,200,160,20);

        //Esta linha "atribui um ouvido" ao botão.
        // Quando o usuário clicar, o método.
        botaoEscolherFoto.addActionListener(botaoEscolherFotoActionListener());

        //será executado para realizar uma ação (provavelmente abrir um seletor de arquivos).
        botaoEscolherFotoActionListener();

        //Coloca o botão na janela.
        getContenPane().add(botaoEscolherFoto);

    }

    private ActionListener botaoEscolherFotoActionListener(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChosser = new JFileChooser();
                //fileChooser.showOpenDialog(telaCadastro.this);
                int opcao = fileChooser.showOpenDialog(TelaCadastro.this);

                if(opcao == JFileChooser.APPROVE_OPTION){
                    File arquivoSelectionado = fileChooser.getSerlectedFile();
                    //System.out.println(arquivoSelectionado.getNome());
                    String caminho = arquivoSelectionado.getAbsolutePath();

                    ImagIcon imageIcon = new ImageIcon(caminho);
                    labelFoto.setIcon(imageIcon);
                }
            };

        }
    }


    private ActionListener botaoSalvarActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo( (TipoSexo) campoSexo.getSelectedItem());

                try {
                    logicaCadastro.salvar(cliente);
                    logicaCadastro.imprimirRegistros();
                } catch (CpfInvalidoException ex) {
                    //JOptionPane é uma classe do Swing usada para criar janelas prontas de diálogo, como:
                    //Mensagem de erro, Avisos, confirmações (Sim/Não) e Perguntas.
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            }
        };
    }
}


