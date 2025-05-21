import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame{
    private JPanel tela;
    private JLabel Tipo,Nome,Rg,Email,Pais,Municipio,Logadouro,Numero,Bairro,Expedor,Cep,Uf,Telefone,Situacao,Fornecedor,Titulo,Cpf,Complemento;
    private JTextField envTipo,envNome,envCpf,envFornecedor,envRg,envExpedor,envEmail,envCep,envPais,envUf,envUF2,envMunicipio,envLogadouro,envNumero,envComplemento,envBairro,envTelefone;
    private JRadioButton radAtivo,radDesativo;
    private ButtonGroup grupoRadio;
    private JComboBox<String> comboBox;
    private JButton Confirmar,Excluir,Limpar;
    private JCheckBox checkFornecedor;

    public Tela(){
        super("Tela de cadastro");
        Janela();
    }

    public void Janela(){
            
            tela = new JPanel();
            tela.setLayout(null);
            //Título


            Titulo= new JLabel("Cadastro de Pessoa");
            Titulo.setBounds(30, 30, 600,50);
            Titulo.setFont(new Font("Arial", Font.BOLD, 60));
            Titulo.setOpaque(true);
            Titulo.setForeground(Color.orange);
            
        //!------------ parte dos textos---------------
        	//Nomes
            Tipo = new JLabel("Tipo");
            Tipo.setBounds(30,110,170,30);
            Tipo.setBorder(BorderFactory.createLineBorder(Color.black));
            Tipo.setBackground(Color.WHITE);
            Tipo.setVerticalAlignment(JLabel.CENTER);
            Tipo.setHorizontalAlignment(JLabel.CENTER);


            Nome = new JLabel("Nome");
            Nome.setBounds(30,150,170,30);
            Nome.setBorder(BorderFactory.createLineBorder(Color.black));
            Nome.setVerticalAlignment(JLabel.CENTER);
            Nome.setHorizontalAlignment(JLabel.CENTER);

            Cpf = new JLabel("Cpf/Cnpj..");
            Cpf.setBounds(30,150,170,30);
            Cpf.setBorder(BorderFactory.createLineBorder(Color.black));
            Cpf.setVerticalAlignment(JLabel.CENTER);
            Cpf.setHorizontalAlignment(JLabel.CENTER);

            Rg = new JLabel("RG / Incrição Estadual");
            Rg.setBounds(30,190,170,30);
            Rg.setBorder(BorderFactory.createLineBorder(Color.black));
            Rg.setVerticalAlignment(JLabel.CENTER);
            Rg.setHorizontalAlignment(JLabel.CENTER);

            Email = new JLabel("Email");
            Email.setBounds(30,230,170,30);
            Email.setBorder(BorderFactory.createLineBorder(Color.black));
            Email.setVerticalAlignment(JLabel.CENTER);
            Email.setHorizontalAlignment(JLabel.CENTER);
            
            Pais = new JLabel("Pais");
            Pais.setBounds(30,270,170,30);
            Pais.setBorder(BorderFactory.createLineBorder(Color.black));
            Pais.setVerticalAlignment(JLabel.CENTER);
            Pais.setHorizontalAlignment(JLabel.CENTER);
            
            Municipio = new JLabel("Município ...");
            Municipio.setBounds(30,310,170,30);
            Municipio.setBorder(BorderFactory.createLineBorder(Color.black));
            Municipio.setVerticalAlignment(JLabel.CENTER);
            Municipio.setHorizontalAlignment(JLabel.CENTER);
            
            Logadouro = new JLabel("Logadouro");
            Logadouro.setBounds(30,350,170,30);
            Logadouro.setBorder(BorderFactory.createLineBorder(Color.black));
            Logadouro.setVerticalAlignment(JLabel.CENTER);
            Logadouro.setHorizontalAlignment(JLabel.CENTER);

            
            Numero = new JLabel("Numero");
            Numero.setBounds(30,390,170,30);
            Numero.setBorder(BorderFactory.createLineBorder(Color.black));
            Numero.setVerticalAlignment(JLabel.CENTER);
            Numero.setHorizontalAlignment(JLabel.CENTER);
            
            Bairro = new JLabel("Bairro");
            Bairro.setBounds(30,430,170,30);
            Bairro.setBorder(BorderFactory.createLineBorder(Color.black));
            Bairro.setVerticalAlignment(JLabel.CENTER);
            Bairro.setHorizontalAlignment(JLabel.CENTER);

            Expedor = new JLabel("Orgão Expedor");
            Expedor.setBounds(30,0,170,30);
            Expedor.setBorder(BorderFactory.createLineBorder(Color.black));
            Expedor.setVerticalAlignment(JLabel.CENTER);
            Expedor.setHorizontalAlignment(JLabel.CENTER);

            Cep = new JLabel("CEP");
            Cep.setBounds(30,0,170,30);
            Cep.setBorder(BorderFactory.createLineBorder(Color.black));
            Cep.setVerticalAlignment(JLabel.CENTER);
            Cep.setHorizontalAlignment(JLabel.CENTER);

            Complemento = new JLabel("Complemento");
            Complemento.setBounds(30,0,170,30);
            Complemento.setBorder(BorderFactory.createLineBorder(Color.black));
            Complemento.setVerticalAlignment(JLabel.CENTER);
            Complemento.setHorizontalAlignment(JLabel.CENTER);
            
            Uf = new JLabel("UF ...");
            Uf.setBounds(30,0,170,30);
            Uf.setBorder(BorderFactory.createLineBorder(Color.black));
            Uf.setVerticalAlignment(JLabel.CENTER);
            Uf.setHorizontalAlignment(JLabel.CENTER);

            Telefone = new JLabel("Telefone");
            Telefone.setBounds(30,0,170,30);
            Telefone.setBorder(BorderFactory.createLineBorder(Color.black));
            Telefone.setVerticalAlignment(JLabel.CENTER);
            Telefone.setHorizontalAlignment(JLabel.CENTER);

            Situacao = new JLabel("Situação");
            Situacao.setBounds(30,0,170,30);
            Situacao.setBorder(BorderFactory.createLineBorder(Color.black));
            Situacao.setVerticalAlignment(JLabel.CENTER);
            Situacao.setHorizontalAlignment(JLabel.CENTER);

            Fornecedor = new JLabel("Fornecedor");
            Fornecedor.setBounds(30,0,170,30);
            Fornecedor.setBorder(BorderFactory.createLineBorder(Color.black));
            Fornecedor.setVerticalAlignment(JLabel.CENTER);
            Fornecedor.setHorizontalAlignment(JLabel.CENTER);
        //!------------ parte dos textos ---------------


            

    
        //?------------ Entrada de dados ---------------

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
            envCpf = new JTextField(20);
            envUf = new JTextField(20);
            envFornecedor = new JTextField(20);
            envUF2 = new JTextField(20);
            envComplemento = new JTextField(20);
            envTelefone = new JTextField(20);
        //?------------ Entrada de dados ---------------
    
        // Combo box
            String[] opcoes = {"Física", "Jurídica"};
            comboBox = new JComboBox<>(opcoes);
            comboBox.setBounds(170,30,170,30);
        
            
        //Radio Group
            radAtivo = new JRadioButton("Ativo");
            radDesativo = new JRadioButton("Desativo");
            grupoRadio = new ButtonGroup();
    
            grupoRadio.add(radAtivo);
            grupoRadio.add(radDesativo);
        
        // Botoes
        Confirmar = new JButton("Confirmar");
            Confirmar.addActionListener(e -> System.out.println("Enviado dados"));
            Confirmar.setBounds(30,490,140,30);
            Confirmar.setBorder(BorderFactory.createLineBorder(Color.gray));
            Confirmar.setVerticalAlignment(JLabel.CENTER);
            Confirmar.setHorizontalAlignment(JLabel.CENTER);
            Confirmar.setBackground(Color.orange);
            Confirmar.setForeground(Color.white);

            
            Excluir = new JButton("Excluir");
            Excluir.setBounds(180,490,140,30);
            Excluir.setBorder(BorderFactory.createLineBorder(Color.gray));
            Excluir.setVerticalAlignment(JLabel.CENTER);
            Excluir.setHorizontalAlignment(JLabel.CENTER);
            Excluir.setBackground(Color.orange);
            Excluir.setForeground(Color.white);
            Excluir.addActionListener(e -> System.out.println("Excluindo dados"));
            
            Limpar = new JButton("Limpar");
            Limpar.setBounds(330,490,140,30);
            Limpar.setBorder(BorderFactory.createLineBorder(Color.gray));
            Limpar.setVerticalAlignment(JLabel.CENTER);
            Limpar.setHorizontalAlignment(JLabel.CENTER);
            Limpar.setBackground(Color.gray);
            Limpar.addActionListener(e -> System.out.println("Campos limpos"));
    
        // checkbox
        checkFornecedor = new JCheckBox();
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
        tela.repaint();
        
        
        this.setContentPane(tela);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
}