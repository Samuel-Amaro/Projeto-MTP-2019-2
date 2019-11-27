//tela de visualização de likes, e aonde o panel vai ser istanciado de maneira dinamica para visualizar seus likes recebidos em um post atual
//em seus ultimo post postado
package meuprimeirojframe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaVisualizacaoDosLikes extends javax.swing.JFrame {

    private PupularLikePost like;
    private UsuarioDataBase  usuarioLogado;
    private ClassePost post;
    private PupularLikePost likeRecebido;
    public TelaVisualizacaoDosLikes(UsuarioDataBase usuarioLogado,ClassePost post) {
        initComponents();
        jPanel1.setLayout(new WrapLayout());//mudando o layout para vertical
        setLocationRelativeTo(null); // para a tela ficar centralizada
        this.usuarioLogado = usuarioLogado; //usuario logado, mas não e oque da like
        this.post = post; //o post referido que tera os likes mostrados
        this.likeRecebido = new PupularLikePost(); //objeto que contera as informação de um like atual avaliado pelo flag
            //setando em um objeto de tipo like as informações de um usuario que deu like em um post atual para mostrar quem deu like
            ConexaoBancoDeDados con;//objeto de tipo conexa
            try {
                //criando conexão
                con = new ConexaoBancoDeDados(this.usuarioLogado);
                con.conectar();//conectando
                PreparedStatement trazQuemDeuLike = con.getConnection().prepareStatement("SELECT id_like, fk_pessoa, fk_post, data_like FROM like_post WHERE fk_post = ?;");
                //setando na consulta o post que eu quero mostrar os likes
                trazQuemDeuLike.setInt(1, this.post.getId_post());
                //executando a consulta
                ResultSet result = trazQuemDeuLike.executeQuery();
                //vendo se oque a consulta traz e oque eu quero
                while(result.next()) {
                    //setando resultados da consulta no objeto de tipo like para mandar para a tela de visualização de likes
                    likeRecebido.setId_like(result.getInt(1));//setando o id do like
                    likeRecebido.setFk_Pessoa_Deu_Like(result.getInt(2));//setando a pessoa que deu like no post
                    likeRecebido.setFk_post(result.getInt(3));//setando a fk do post
                    likeRecebido.setDataDoDia(result.getDate(4));//setando a data do dia do like
                    //passando meu objeto de tipo like o panel interno que esta sendo istanciado
                    JPanelMostraLikesRecebidos mostraLike = new JPanelMostraLikesRecebidos(likeRecebido);
                    //adicionando ao painel interno o componente de tipo jpanel interno
                    this.jPanel1.add(mostraLike);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro ao buscar que deu like!");
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoSair.setText("sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(botaoSair))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(botaoSair))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        //borão para sair da tela de ver likes
        //TelaPrincipalDoSistemaAlteraCadastro(this.usuarioLogado);
        //pn.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
