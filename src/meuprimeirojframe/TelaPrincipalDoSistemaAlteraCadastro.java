//ao entrar na minha tela de login e o login estiver correto, e não ocorre nenhuma exception e nehum erro, ao aparecer minha mensagem de
// sucesso com o login feito corretamente, eu vou istanciar uma nova tela, do tipo altera cadastro com o botão altera cadastro, essa tela aqui
//essa e tela principal do sistema nela ira conter tudo de necessario para o sistema ela por enquanto so faz alterar um cadastro
//tudo de comun entre essas telas e o usuario que agora e uma classe
package meuprimeirojframe;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPrincipalDoSistemaAlteraCadastro extends javax.swing.JFrame {
  
    private UsuarioDataBase userPrincipal; //uma atributo global do tipo usuario
    
    public TelaPrincipalDoSistemaAlteraCadastro() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }
    
    //metodo costrutor que recebe um objeto do tipo usuario
    public TelaPrincipalDoSistemaAlteraCadastro(UsuarioDataBase userAltera) {
        initComponents();
        this.userPrincipal = userAltera;
        setLocationRelativeTo(null);
        //mostra uma mensagem inicial para o usuario!
        this.labelMostraMensagemInicial.setText("Ola, Bem Vindo " + this.userPrincipal.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAltera = new javax.swing.JButton();
        retornaParaTelaAnterior = new javax.swing.JButton();
        botaoCriaUmNovoPost = new javax.swing.JButton();
        excluirUmUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelMostraMensagemInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAltera.setText("Altera,Cadastro?");
        botaoAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteraActionPerformed(evt);
            }
        });

        retornaParaTelaAnterior.setText("retorna Para tela anterior!");
        retornaParaTelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornaParaTelaAnteriorActionPerformed(evt);
            }
        });

        botaoCriaUmNovoPost.setText("Cria Um Novo Post!");
        botaoCriaUmNovoPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriaUmNovoPostActionPerformed(evt);
            }
        });

        excluirUmUsuario.setText("Excluir Usuario!");
        excluirUmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUmUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoCriaUmNovoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelMostraMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(excluirUmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retornaParaTelaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelMostraMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAltera)
                        .addGap(18, 18, 18)
                        .addComponent(excluirUmUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(retornaParaTelaAnterior))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCriaUmNovoPost)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlteraActionPerformed
      //ao apertar no botão ira para a tela de cadastro
      TelaCadastro cadastro = new TelaCadastro(this.userPrincipal);
      cadastro.setVisible(true);
      dispose();
    }//GEN-LAST:event_botaoAlteraActionPerformed

    private void retornaParaTelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornaParaTelaAnteriorActionPerformed
     //se não querer altera cadastro retorne para a tela de login
     TelaLoginUm retornaParaLogin = new TelaLoginUm();
     retornaParaLogin.setVisible(true);
     dispose();
    }//GEN-LAST:event_retornaParaTelaAnteriorActionPerformed
    
     //ao clicar no botão excluir cadastro exclui um cadastro que ja existe no banco de dados
    private void excluirUmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUmUsuarioActionPerformed
        try {
            ConexaoBancoDeDados excluirUsuario = new ConexaoBancoDeDados(this.userPrincipal);
            excluirUsuario.conectar();
            excluirUsuario.excluiUsuario();
            JOptionPane.showMessageDialog(null,"Usuario Excluido com Sucesso!");
        } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"Usuario Não foi Excluido!");
        }
    }//GEN-LAST:event_excluirUmUsuarioActionPerformed

    private void botaoCriaUmNovoPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriaUmNovoPostActionPerformed
        CriarPost cp = new CriarPost(this.userPrincipal);
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCriaUmNovoPostActionPerformed
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAltera;
    private javax.swing.JButton botaoCriaUmNovoPost;
    private javax.swing.JButton excluirUmUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMostraMensagemInicial;
    private javax.swing.JButton retornaParaTelaAnterior;
    // End of variables declaration//GEN-END:variables
}
