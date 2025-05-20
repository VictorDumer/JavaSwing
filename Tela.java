import java.awt.Color;

import javax.swing.*;

public class Tela extends JFrame{
    private JPanel tela;
    private JLabel Tipo,Nome,Rg,Email,Pais,Municipio,Logadouro,Numero,Bairro,Expedor,Cep,Uf,Telefone,Situacao,Fornecedor,Titulo;
    private JTextField envTipo,envNome,envCpf,envFornecedor,envRg,envExpedor,envEmail,envCep,envPais,envUf,envUF2,envMunicipio,envLogadouro,envNumero,envComplemento,envBairro,envTelefone;
    private JRadioButton radAtivo,radDesativo;
    private ButtonGroup grupoRadio;
    private JComboBox<String> comboBox = new JComboBox<>();
    private JButton Confirmar,Excluir,Limpar;
    private JCheckBox checkFornecedor;

    public Tela(){
        super("Tela de cadastro");
        Janela();
    }

    public void Janela(){
            
            tela = new JPanel();
            //Título
            Titulo= new JLabel("Cadastro de Pessoa");
            Titulo.setBounds(500, 500, 300, 300);
            Titulo.setForeground(Color.ORANGE);
        	//Nomes
            Tipo = new JLabel("Tipo");
            Nome = new JLabel("Nome");
            Rg = new JLabel("RG/Incrição Estadual");
            Email = new JLabel("Email");
            Pais = new JLabel("Pais");
            Municipio = new JLabel("Município ...");
            Logadouro = new JLabel("Logadouro");
            Numero = new JLabel("Numero");
            Bairro = new JLabel("Bairro");
            Expedor = new JLabel("Orgão Expedor");
            Cep = new JLabel("CEP");
            Uf = new JLabel("UF ...");
            Telefone = new JLabel("Telefone");
            Situacao = new JLabel("Situação");

    
        //Entrada de dados
            envTipo = new JTextField(20);
            envNome = new JTextField(100);
            envRg = new JTextField(20);
            envEmail = new JTextField(100);
            envPais = new JTextField(20);
            envMunicipio = new JTextField(100);
            envLogadouro = new JTextField(20);
            envNumero = new JTextField(20);
            envBairro = new JTextField(20);
            envExpedor = new JTextField(20);
            envCep = new JTextField(20);
            envUf = new JTextField(20);
            envTelefone = new JTextField(20);
    
        // Combo box
            String[] opcoes = {"Física","Jurídica"};
            comboBox = new JComboBox<>(opcoes);
    
        //Radio Group
            radAtivo = new JRadioButton("Ativo");
            radDesativo = new JRadioButton("Desativo");
            grupoRadio = new ButtonGroup();
    
            grupoRadio.add(radAtivo);
            grupoRadio.add(radDesativo);
        
        // Botoes
        Confirmar = new JButton("Confirmar");
            Confirmar.addActionListener(e -> System.out.println("Enviado dados"));
            
            Excluir = new JButton("Excluir");
            
            Excluir.addActionListener(e -> System.out.println("Excluindo dados"));
            
            Limpar = new JButton("Limpar");
            
            Limpar.addActionListener(e -> System.out.println("Campos limpos"));
    
        // checkbox
        checkFornecedor = new JCheckBox("Sou fornecedor");
        tela.add(Tipo);
        tela.add(Nome);
        tela.add(Rg);
        tela.add(Email);
        tela.add(Pais);
        tela.add(Municipio);
        tela.add(Logadouro);
        tela.add(Numero);
        tela.add(Bairro);
        tela.add(Expedor);
        tela.add(Cep);
        tela.add(Uf);
        tela.add(Telefone);
        tela.add(Situacao);

        tela.add(envTipo);
        tela.add(envNome);
        tela.add(envRg);
        tela.add(envEmail);
        tela.add(envPais);
        tela.add(envMunicipio);
        tela.add(envLogadouro);
        tela.add(envNumero);
        tela.add(envBairro);
        tela.add(envExpedor);
        tela.add(envCep);
        tela.add(envUf);
        tela.add(envTelefone);
        tela.add(Titulo);
        tela.add(checkFornecedor);
        tela.add(Confirmar);
        tela.add(Excluir);
        tela.add(Limpar);
        tela.add(radAtivo);
        tela.add(radDesativo);
        tela.add(comboBox);
        
        this.setLocationRelativeTo(null);
        this.setContentPane(tela);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Tela();
    }
}