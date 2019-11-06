//tela de login onde informa um usuario e senha
package meuprimeirojframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TelaLoginUm extends javax.swing.JFrame implements ActionListener { 
                                                    //implementando uma interface para fazer uma ação para o botão
   
    UsuarioDataBase userLogin; // um atributo global do tipo usuario que guardara toda informação de um usuario
    //METODO COSTRUTOR QUE INICIA COMPONENTES LOGO DE CARA
    public TelaLoginUm() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoTexto1Usuario = new javax.swing.JTextField();
        botao2Entrari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1CampoSenha = new javax.swing.JPasswordField();
        campoTexto3MensagemParaLogin = new javax.swing.JLabel();
        botao2Cancelar = new javax.swing.JButton();
        campoTexto4MensagemDeInformação = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("         Usuario:");

        botao2Entrari.setText("Entrar!");
        botao2Entrari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2EntrariActionPerformed(evt);
            }
        });

        jLabel2.setText("        Senha:");

        jPasswordField1CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1CampoSenhaActionPerformed(evt);
            }
        });

        botao2Cancelar.setText("Cancelar!");
        botao2Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2CancelarActionPerformed(evt);
            }
        });

        campoTexto4MensagemDeInformação.setText("  Bem Vindo(a), Aqui o Senhor(a) fazera Seu login na Sua Conta Existente!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTexto4MensagemDeInformação)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(campoTexto3MensagemParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoTexto1Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botao2Entrari)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botao2Cancelar))
                                        .addComponent(jPasswordField1CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(campoTexto4MensagemDeInformação, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTexto1Usuario))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1CampoSenha))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao2Cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao2Entrari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(campoTexto3MensagemParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //IMPLEMENTANDO METODO DA INTERFACE ACTION LISTENER, VAI EXECUTAR UMA AÇÃO EM UM EVENTO EM UM BOTÃO AO CLICALO
    private void botao2EntrariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2EntrariActionPerformed
        //condição se caso umas das caixas de texto estejam vazias
        if(evt.getSource() == this.botao2Entrari) {
           if(this.campoTexto1Usuario.equals("") || new String(this.jPasswordField1CampoSenha.getPassword()).equals("")) {
              JOptionPane.showMessageDialog(this,"Digite Um Usuario Cadastrado!");
           }
        }
        /* uma ação diferente para o botão*/
        // criando uma ação para conectar ao banco de dados, ao clicar no botão entrar, conecta ao banco de dados com algum usuario e senha informados nos textFild
        //objeto istanciado da classe do banco de dados, retorna um objeto do tipo conexão que sera usado para fazer uma conecxão
        ConexaoBancoDeDados conection = new ConexaoBancoDeDados();
        conection.conectar(); //chamado metodo conectar para conectar ao banco de dados
        //o parametro e o campo texto que alguem digitou e logo depois pego o que ele digitou e passo como parametro
        //metodo que recebe um usuario e senha e verifica se ele existe se existir
        //o paramtro do metodo e diferente do que o getsenha retorna um vetorchar, por isso converto ele como string para passar para meu metodo
        //metodo login so faz puxar algo que ja existi no banco de dados, ou que não extiste retorna nada
        //OQUE MEU METODO LOGIN RETORNA E UM USUARIO COMPLETO COM TODOS SEUS DADOS, EU GUARDO ESSE CARA NUMA VARIAVEL DE TIPO USUARIO
        this.userLogin = conection.login(campoTexto1Usuario.getText(),new String(jPasswordField1CampoSenha.getPassword()));
        // o resultado de login retorna um usuario completo, se tiver alguem cadastrado retorna ele e verifica no if se login retorna a alguma pessoa
        //apos o retorno tenho que valida oque login retorna
        if(this.userLogin != null) { 
           //verifica se tem algo dentro de resultado se tiver ele manda uma mensagem 
           //apos verifica se no ma minha variavel tem alguma pessoa existente do banco e apos logado, vai abrir uma nova tela.
           JOptionPane.showMessageDialog(null,"Logado com Sucesso!");
           //apos o login feito com suceeso abrirei uma nova tela e nessa tela e a tela principal do sistema, para essa tela em seu
           //metodo costrutor passarei um objeto do tipo da classe usuario, nesse objeto ira conter tudo de dado e informação de um usuario recem logado
           //isso e feito atraves do costrutor desssa nova tela e por meio da conexão criada e o metodo login tudo guradado em resultadousuario
           TelaPrincipalDoSistemaAlteraCadastro pf = new TelaPrincipalDoSistemaAlteraCadastro(this.userLogin);
           pf.setVisible(true); //deixa tela nova vizivel
           dispose(); // desfas da tela atual
        }
        
        else{
                //ocorreu um erro qualquer da essa mensagem            
                JOptionPane.showMessageDialog(null,"E necessario Digitar seu email e senha, Corretamente para Fazer Login, Se estiver Correto e Sinal de que Voçê Não esta Cadastrado, Se cadastre Agora!");
        }
  
    }//GEN-LAST:event_botao2EntrariActionPerformed

    private void botao2CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2CancelarActionPerformed
        //se apertar botão cancelar volta para a tela anterior a de inicio
        //istanciando ela
        TelaInicioProjetoMTPParte1 ti = new TelaInicioProjetoMTPParte1();
        ti.setVisible(true); // deixa a tela visivel
        dispose(); //fecha a tela atual 
    }//GEN-LAST:event_botao2CancelarActionPerformed

    private void jPasswordField1CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1CampoSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao2Cancelar;
    private javax.swing.JButton botao2Entrari;
    private javax.swing.JTextField campoTexto1Usuario;
    private javax.swing.JLabel campoTexto3MensagemParaLogin;
    private javax.swing.JLabel campoTexto4MensagemDeInformação;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1CampoSenha;
    // End of variables declaration//GEN-END:variables

    
    //metodos abstratos do evento ActionListener da interface 1 - MANEIRA DE FAZER UM EVENTO PARA UM BOTÃO
    @Override
    public void actionPerformed(ActionEvent ae) {
        // jTexto.setText("Voçê Clicou!"); 1 - MAEIRA DE FAZER UMA AÇÃO NO BOTÃO
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
} 
