
package meuprimeirojframe;

import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTextoNomeCompletoTelaCadastro1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTextoTelefone2TelaCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTextoEmail3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTexto4CidadeEstado = new javax.swing.JTextField();
        botao1ConfirmaCadastro = new javax.swing.JButton();
        jPasswordFieldSenha1 = new javax.swing.JPasswordField();
        confirmaSenha2 = new javax.swing.JPasswordField();
        botao2CancelaCadastro = new javax.swing.JButton();
        botaoParaTestarCadastroAposFeito = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoTexto1.setText("Cadastro De Um Novo Usuario(a)!");

        jLabel1.setText("    Nome Completo");

        campoTextoNomeCompletoTelaCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNomeCompletoTelaCadastro1ActionPerformed(evt);
            }
        });

        jLabel2.setText("    Telefone:");

        campoTextoTelefone2TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoTelefone2TelaCadastroActionPerformed(evt);
            }
        });

        jLabel3.setText("    E-Mail:");

        jLabel4.setText("   Cidade/Estado :");

        jLabel5.setText("         Senha:");

        jLabel6.setText("  Confimar-senha:");

        campoTexto4CidadeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto4CidadeEstadoActionPerformed(evt);
            }
        });

        botao1ConfirmaCadastro.setText("Confirma,Cadastro!");
        botao1ConfirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ConfirmaCadastroActionPerformed(evt);
            }
        });

        botao2CancelaCadastro.setText("Cancelar,Cadastro!");
        botao2CancelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2CancelaCadastroActionPerformed(evt);
            }
        });

        botaoParaTestarCadastroAposFeito.setText("Fazer Login!");
        botaoParaTestarCadastroAposFeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoParaTestarCadastroAposFeitoActionPerformed(evt);
            }
        });

        jLabel7.setText(" Esta Cadastrado? Faça Login!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoTexto1)
                .addGap(274, 274, 274))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoTextoTelefone2TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoTextoNomeCompletoTelaCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoTextoEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoTexto4CidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordFieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao1ConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao2CancelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoParaTestarCadastroAposFeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoNomeCompletoTelaCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoTelefone2TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTexto4CidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1ConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao2CancelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoParaTestarCadastroAposFeito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoNomeCompletoTelaCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNomeCompletoTelaCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNomeCompletoTelaCadastro1ActionPerformed

    private void botao2CancelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2CancelaCadastroActionPerformed
        //istanciando tela secunadria, de inicio, ao clicar no botão iniciar
        //criando nova tela de inicio para voltar
        TelaInicioProjetoMTPParte1 tipm = new TelaInicioProjetoMTPParte1(); 
        tipm.setVisible(true); //deixando ela visivel
        dispose(); //encerrando tela atual de cadastro
    }//GEN-LAST:event_botao2CancelaCadastroActionPerformed

    private void botao1ConfirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ConfirmaCadastroActionPerformed
    //peculiaridade
    //guardo a senha de cadastro em um objeto de tipo string
    String senha = new String(jPasswordFieldSenha1.getPassword());
    //faço o mesmo para a senha de confirmação
    String confirmaSenha = new String(confirmaSenha2.getPassword());    
    //comparo as duas senhas se forem iguais eu cadastro essa pessoa atual no BD
    if(senha.equals(confirmaSenha)){
       /*apos usuario digitar em todos as caixas de texto seus respectivos dados, tenho que cadastrar esses dados em meu banco de dados do projeto*/
       /*istanciando uma nova conexão para meu banco de dados,retorna um objeto que nele esta contido a conexão com O BD*/
       ConexaoBancoDeDados conectaDataBase = new ConexaoBancoDeDados();
       /*apos istancia um objeto de tipo conexão tenho que chamar um metodo especifico que conecta ao database*/
       conectaDataBase.conectar();
       conectaDataBase.inserirIntoDataBase(campoTextoNomeCompletoTelaCadastro1.getText(),campoTextoEmail3.getText(),new String(jPasswordFieldSenha1.getPassword()),campoTextoTelefone2TelaCadastro.getText(),campoTexto4CidadeEstado.getText());
       JOptionPane.showMessageDialog(null,"Cadastrato com Sucesso!");
    }
     //se as senhas estiverem diferentes eu mando uma mensagem para arrumar as senha
     else{
          JOptionPane.showMessageDialog(null,"Senhas cadastradas são diferentes,Tem que ser senhas iguais,Não foi Cadastrado Ainda!"); 
    }//GEN-LAST:event_botao1ConfirmaCadastroActionPerformed
     }
    private void campoTextoTelefone2TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTelefone2TelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoTelefone2TelaCadastroActionPerformed

    private void campoTexto4CidadeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto4CidadeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto4CidadeEstadoActionPerformed

    private void botaoParaTestarCadastroAposFeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoParaTestarCadastroAposFeitoActionPerformed
        //ao cadastrar preciso fazer um login para testar por isso esse botão
        //ele vai para a tela de login
        TelaLoginUm retornaParaTelaLogin = new TelaLoginUm();
        retornaParaTelaLogin.setVisible(true);
        setLocationRelativeTo(null); // para a tela ficar centralizada
        dispose();
    }//GEN-LAST:event_botaoParaTestarCadastroAposFeitoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1ConfirmaCadastro;
    private javax.swing.JButton botao2CancelaCadastro;
    private javax.swing.JButton botaoParaTestarCadastroAposFeito;
    private javax.swing.JLabel campoTexto1;
    private javax.swing.JTextField campoTexto4CidadeEstado;
    private javax.swing.JTextField campoTextoEmail3;
    private javax.swing.JTextField campoTextoNomeCompletoTelaCadastro1;
    private javax.swing.JTextField campoTextoTelefone2TelaCadastro;
    private javax.swing.JPasswordField confirmaSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordFieldSenha1;
    // End of variables declaration//GEN-END:variables
}
