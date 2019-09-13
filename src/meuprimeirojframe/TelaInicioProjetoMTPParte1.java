
package meuprimeirojframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicioProjetoMTPParte1 extends javax.swing.JFrame implements ActionListener{

    public TelaInicioProjetoMTPParte1() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto1LogoIF = new javax.swing.JLabel();
        botao1Entrar = new javax.swing.JButton();
        botao2Cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        campoTexto1LogoIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuprimeirojframe/imagens/download.png"))); // NOI18N
        campoTexto1LogoIF.setText("jLabel1");

        botao1Entrar.setText("Entrar!");
        botao1Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1EntrarActionPerformed(evt);
            }
        });

        botao2Cadastrar.setText("Cadastrar!");
        botao2Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2CadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("              Bem Vindo(a), a  Rede Social Do Istituto Federal De Goias!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTexto1LogoIF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao1Entrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao2Cadastrar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(campoTexto1LogoIF)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao2Cadastrar)
                    .addComponent(botao1Entrar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao1EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1EntrarActionPerformed
        //istanciando tela secundaria tela secundaria, ao clicar no botão aparece uma tela secundaria a de fazer login
        TelaLoginUm pm = new TelaLoginUm();
        pm.setVisible(true); // deixando a tela secundaria visivel 
        dispose(); // encerrando a tela atual que estou nela a de inicio sem o objeto e automatico
        
        
    }//GEN-LAST:event_botao1EntrarActionPerformed

    private void botao2CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2CadastrarActionPerformed
      //apertou botão cadastrar vai para a tela de cadastro
      TelaCadastro fbc = new TelaCadastro();
      fbc.setVisible(true); //deixando ela visivel
      dispose(); // encerrando a tela atual
    }//GEN-LAST:event_botao2CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicioProjetoMTPParte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicioProjetoMTPParte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicioProjetoMTPParte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicioProjetoMTPParte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicioProjetoMTPParte1().setVisible(true);
               
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1Entrar;
    private javax.swing.JButton botao2Cadastrar;
    private javax.swing.JLabel campoTexto1LogoIF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
}
