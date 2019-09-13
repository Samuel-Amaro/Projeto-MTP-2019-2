package meuprimeirojframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TelaLoginUm extends javax.swing.JFrame implements ActionListener { 
//implementando uma interface para fazer uma ação para o botão
   
    //METODO COSTRUTOR QUE INICIA COMPONENTES LOGO DE CARA
    public TelaLoginUm() {
        initComponents();
        // uma ação para o botão 1 MANEIRA
        //jBotao2.addActionListener(this); 
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoTexto1Usuario = new javax.swing.JTextField();
        Botao2ComBotãoCliqueAqui = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1CampoSenha = new javax.swing.JPasswordField();
        campoTexto3MensagemParaLogin = new javax.swing.JLabel();
        botao2Cancelar = new javax.swing.JButton();
        campoTexto4MensagemDeInformação = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("         Usuario:");

        Botao2ComBotãoCliqueAqui.setText("Entrar!");
        Botao2ComBotãoCliqueAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ComBotãoCliqueAquiActionPerformed(evt);
            }
        });

        jLabel2.setText("        Senha:");

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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTexto3MensagemParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTexto1Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jPasswordField1CampoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(campoTexto4MensagemDeInformação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Botao2ComBotãoCliqueAqui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botao2Cancelar)))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(campoTexto4MensagemDeInformação, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTexto1Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1CampoSenha))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao2ComBotãoCliqueAqui)
                    .addComponent(botao2Cancelar))
                .addGap(26, 26, 26)
                .addComponent(campoTexto3MensagemParaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //IMPLEMENTANDO METODO DA INTERFACE ACTION LISTENER, VAI EXECUTAR UMA AÇÃO EM UM EVENTO EM UM BOTÃO AO CLICALO
    private void Botao2ComBotãoCliqueAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ComBotãoCliqueAquiActionPerformed
        /*Uma primeira ação para esse botão*/
        /*// TODO add your handling code here:
        //uma ação para 1 maneira de fazer uma ação para o botão 
        //jTexto.setText("Voçê Clicou!");
        //UMA AÇÃO PARA O BOTÃO 2 - MANEIRA
        if(campoTexto1Usuario.getText().equals("root") && jPasswordField1CampoSenha.getText().equals("123")) {
           //uma maneira de mostrar mensagem em um label
           //campoTexto3MensagemParaLogin.setText("Login feito com Sucesso");
           //mostra uma mensagem dentro de uma caixa de dialogo
            String mensagem = new String("Usuario e Senha Corretos!");
            JOptionPane.showMessageDialog(null,mensagem,"Caixa De Dialogo, Exemplo!", WIDTH);
        }
        else  {
               //mostra uma mensagem em uma caixa de dialogo com um botão
               String mensagem2= new String("Voçê Sera Redicionado, Para Tela De Inicio!");
               JOptionPane.showMessageDialog(null,mensagem2,"Caixa De Dialogo, Exemplo!", WIDTH);
              //campoTexto3MensagemParaLogin.setText("Usuario e senha Incorretos!");
        }*/
        
        //fazendo um açaõ para o botão // criando uma ação para conectar ao banco de dados, ao clicar no botão entrar conecta ao banco de dados com algum usuario e senha
        //objeto istanciado da classe do banco de dados, retorna um objeto do tipo conexão que sera usado para fazer uma conecão
        ConexaoBancoDeDados conection = new ConexaoBancoDeDados();
        conection.conectar(); //chamado metodo conectar para conectar ao banco de dados
        
        //o parametro e o campo texto que alguem digitou e logo depois pego o que ele digitou e passo como parametro
        //metodo que recebe um usuario e senha e verifica se ele existe se existir retorna o nome dessa cara
        //o paramtro do metodo e diferente do que o getsenha retorna um vetorchar, por isso converto ele como string para passar para meu metodo
        //metodo login so faz puxar algo que ja existi no banco de dados, ou que não extiste retorna nada
        String resultado = conection.login(campoTexto1Usuario.getText(),new String(jPasswordField1CampoSenha.getPassword()));
        // o resultado de login retorna um nome, se tiver alguem cadastrado retorna ele e verifica no if se login retorna a alguma pessoa e logo depois da uma mensagem
        //apos o retorno tenho que valida oque login retorna
        if(resultado != null) { //verifica se tem algo dentro de resultado se tiver ele manda uma mensagem 
           JOptionPane.showMessageDialog(null,"Logado com Sucesso! " + resultado);
        }
        else { //se não tiver ninguem retorna isso
            JOptionPane.showMessageDialog(null,"Usuario ou senha Estão Digitados Incorretamente!");
        }
    }//GEN-LAST:event_Botao2ComBotãoCliqueAquiActionPerformed

    private void botao2CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2CancelarActionPerformed
        //se apertar botão cancelar volta para a tela anterior a de inicio
        //istanciando ela
        TelaInicioProjetoMTPParte1 ti = new TelaInicioProjetoMTPParte1();
        ti.setVisible(true); // deixa a tela visivel
        dispose(); //fecha a tela atual 
    }//GEN-LAST:event_botao2CancelarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginUm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //ISTANCIA UM OBJETO ANONIMO PARA EU NÃO TER ACESSO
                new TelaLoginUm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao2ComBotãoCliqueAqui;
    private javax.swing.JButton botao2Cancelar;
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
