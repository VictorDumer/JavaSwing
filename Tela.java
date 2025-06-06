import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame{
    private JPanel tela;
    private JLabel Tipo,Nome,Rg,Email,Pais,Municipio,Logadouro,Numero,Bairro,Expedor,Cep,Uf,Telefone,Situacao,Fornecedor,Titulo,Cpf,Complemento;
    private JTextField envTipo,envNome,envCpf,envRg,envExpedor,envEmail,envCep,envPais,envUf,envUF2,envMunicipio,envLogadouro,envNumero,envComplemento,envBairro,envTelefone;
    private JRadioButton radAtivo,radDesativo;
    private ButtonGroup grupoRadio;
    private JComboBox<String> comboBox;
    private JButton Confirmar,Excluir,Limpar;
    private JCheckBox checkFornecedor;
    private JTextField[] listaCampos = {
    envTipo, envNome, envCpf, envRg, envExpedor, envEmail, envCep,
    envPais, envUf, envUF2, envMunicipio, envLogadouro, envNumero,
    envComplemento, envBairro, envTelefone
};
    
    public Tela(){
        super("Tela de cadastro");
        Janela();
        listaCampos = new JTextField[] {
        envTipo, envNome, envCpf, envRg, envExpedor, envEmail, envCep,
        envPais, envUf, envUF2, envMunicipio, envLogadouro, envNumero,
        envComplemento, envBairro, envTelefone};
    }

    public void Janela(){
            
            tela = new JPanel();
            tela.setLayout(null);
            


            Titulo= new JLabel("Cadastro de Pessoa");
            Titulo.setBounds(30, 30, 600,50);
            Titulo.setFont(new Font("Arial", Font.BOLD, 60)); // * Tipo e tamho da fonte 
            Titulo.setForeground(Color.orange); // * Cor do texto
            
        //?-_-_-_-_-_-parte dos textos-_-_-_-_-_-
        	
            Tipo = new JLabel("Tipo");
            Tipo.setBounds(30,110,170,30); // * Define tamanho
            Tipo.setBorder(BorderFactory.createLineBorder(Color.black)); // * Borda
            Tipo.setVerticalAlignment(JLabel.CENTER); // * Alinha texto Verticalmente
            Tipo.setHorizontalAlignment(JLabel.CENTER);// * Alinha texto Horizontalmente

            Nome = new JLabel("Nome");
            Nome.setBounds(30,150,170,30);
            Nome.setBorder(BorderFactory.createLineBorder(Color.black));
            Nome.setVerticalAlignment(JLabel.CENTER);
            Nome.setHorizontalAlignment(JLabel.CENTER);

            Cpf = new JLabel("CPF/CNPJ ...");
            Cpf.setBounds(390,110,170,30);
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
            Expedor.setBounds(390,190,170,30);
            Expedor.setBorder(BorderFactory.createLineBorder(Color.black));
            Expedor.setVerticalAlignment(JLabel.CENTER);
            Expedor.setHorizontalAlignment(JLabel.CENTER);

            Cep = new JLabel("CEP");
            Cep.setBounds(580,230,170,30);
            Cep.setBorder(BorderFactory.createLineBorder(Color.black));
            Cep.setVerticalAlignment(JLabel.CENTER);
            Cep.setHorizontalAlignment(JLabel.CENTER);

            Complemento = new JLabel("Complemento");
            Complemento.setBounds(390,390,170,30);
            Complemento.setBorder(BorderFactory.createLineBorder(Color.black));
            Complemento.setVerticalAlignment(JLabel.CENTER);
            Complemento.setHorizontalAlignment(JLabel.CENTER);
            
            Uf = new JLabel("UF ...");
            Uf.setBounds(580,270,170,30);
            Uf.setBorder(BorderFactory.createLineBorder(Color.black));
            Uf.setVerticalAlignment(JLabel.CENTER);
            Uf.setHorizontalAlignment(JLabel.CENTER);

            Telefone = new JLabel("Telefone");
            Telefone.setBounds(390,430,170,30);
            Telefone.setBorder(BorderFactory.createLineBorder(Color.black));
            Telefone.setVerticalAlignment(JLabel.CENTER);
            Telefone.setHorizontalAlignment(JLabel.CENTER);

            Situacao = new JLabel("Situação");
            Situacao.setBounds(770,430,130,30);
            Situacao.setBorder(BorderFactory.createLineBorder(Color.black));
            Situacao.setVerticalAlignment(JLabel.CENTER);
            Situacao.setHorizontalAlignment(JLabel.CENTER);

            Fornecedor = new JLabel("Fornecedor");
            Fornecedor.setBounds(800,110,170,30);
            Fornecedor.setBorder(BorderFactory.createLineBorder(Color.black));
            Fornecedor.setVerticalAlignment(JLabel.CENTER);
            Fornecedor.setHorizontalAlignment(JLabel.CENTER);
           
        //?_-_-_-_-_-_-parte dos textos_-_-_-_-_-_-


            

    
        //?_-_-_-_-_-_-Entrada de dados_-_-_-_-_-_-

            envTipo = new JTextField(20);


            envNome = new JTextField(100);
            envNome.setBounds(210,150,840,30);
            envNome.setBorder(BorderFactory.createLineBorder(Color.black));
            

            envRg = new JTextField(20);
            envRg.setBounds(210,190,170,30);
            envRg.setBorder(BorderFactory.createLineBorder(Color.black));


            envEmail = new JTextField(100);
            envEmail.setBounds(210,230,351,30);
            
            envPais = new JTextField("BRASIL",20);
            envPais.setBounds(210,270,351,30);
            envPais.setBackground(Color.gray);
            
            envMunicipio = new JTextField(100);
            envMunicipio.setBounds(210,310,844,30);
            envMunicipio.setBackground(Color.gray);

            envLogadouro = new JTextField(20);
            envLogadouro.setBounds(210,350,844,30);
            envLogadouro.setBackground(Color.gray);

            envNumero = new JTextField(20);
            envNumero.setBounds(210,390,170,30);

            envBairro = new JTextField(20);
            envBairro.setBounds(210,430,170,30);
            
            envExpedor = new JTextField(20);
            envExpedor.setBounds(580,190,170,30);
            
            envCep = new JTextField(20);
            envCep.setBounds(770,230,283,30);
            
            envCpf = new JTextField(20);
            envCpf.setBounds(580,110,200,30);
            
            envCpf.setBorder(BorderFactory.createLineBorder(Color.black));
            envCpf.setHorizontalAlignment(JLabel.CENTER);

            envUf = new JTextField(20);
            envUf.setBounds(770,270,75,30);

            envUF2 = new JTextField(20);
            envUF2.setBounds(860,270,192,30);
            envUF2.setBackground(Color.gray);
            
            envComplemento = new JTextField(20);
            envComplemento.setBounds(580,390,476,30);
            
            envTelefone = new JTextField(20);
            envTelefone.setBounds(580,430,170,30);
            
            //?_-_-_-_-_-_-checkbox_-_-_-_-_-_-
            checkFornecedor = new JCheckBox();
            checkFornecedor.setBounds(1000,110,140,30);
            
            //!! ___________Combo box___________
            String[] opcoes = {"Física", "Jurídica"};
            comboBox = new JComboBox<>(opcoes);
            comboBox.setBounds(210,110,170,30);
        
            //!! ___________Radio Group___________
            radAtivo = new JRadioButton("Ativo");
            radAtivo.setBounds(920,430,70,30);
            
            radDesativo = new JRadioButton("Inativo");
            radDesativo.setBounds(990,430,77,30);
            
            grupoRadio = new ButtonGroup();
            
            grupoRadio.add(radAtivo);
            grupoRadio.add(radDesativo); 
            
            //!! ___________Botões___________
            Confirmar = new JButton("Confirmar");
            Confirmar.addActionListener(e -> Confirmar());
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
            Excluir.addActionListener(e -> Deletar());
            
            Limpar = new JButton("Limpar");
            Limpar.setBounds(330,490,140,30);
            Limpar.setBorder(BorderFactory.createLineBorder(Color.gray));
            Limpar.setVerticalAlignment(JLabel.CENTER);
            Limpar.setHorizontalAlignment(JLabel.CENTER);
            Limpar.setBackground(Color.gray);
            Limpar.addActionListener(e -> Limpar());
        //?------------ Entrada de dados ---------------
        

        //!! ___________Adição na tela___________ 
            tela.add(Cpf);
            tela.add(Fornecedor);
            tela.add(envCpf);
            tela.add(radAtivo);
            tela.add(radDesativo);
            tela.add(envUF2);
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
            tela.add(Complemento);
            tela.add(envComplemento);

        
        
        this.setContentPane(tela);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1130,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void Confirmar(){
        JOptionPane.showMessageDialog(null,
        "Dados Confirmados", "Envio dos dados",
        JOptionPane.INFORMATION_MESSAGE);
        Esvaziar();
        
    }
    private void Limpar(){
        JOptionPane.showMessageDialog(null, "Campos limpos", "Esvaziamento de dados", JOptionPane.INFORMATION_MESSAGE);
        Esvaziar();
    }
    private void Esvaziar(){
        for (JTextField campo : listaCampos) {
        campo.setText("");
        }
    }
    private void Deletar(){
        JOptionPane.showMessageDialog(null, "Dados Excluídos", "Exclusão de dados", JOptionPane.INFORMATION_MESSAGE);
        Esvaziar();
    }
    
}