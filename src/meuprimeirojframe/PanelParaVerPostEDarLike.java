//painel que vai mostrar todos os post cadastrados e existentes.
package meuprimeirojframe;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PanelParaVerPostEDarLike extends javax.swing.JPanel {

    private ClassePost post; //atributo de tipo de um post populado
    private ConexaoBancoDeDados conexao; //atributo de tipo conexão
    private UsuarioDataBase usuarioDonoPost;
    private UsuarioDataBase usuarioVaiDarLike;
    public PanelParaVerPostEDarLike() {
        initComponents();
    }
    public PanelParaVerPostEDarLike(ClassePost post,UsuarioDataBase user) {
     initComponents();
     this.usuarioVaiDarLike = user;
     this.post = post;
     //setando as informações vindo por um objeo de tipo post que ira aparecer no panel interno
     //setando a descrição na label
     this.labelDescricaoPost.setText(this.post.getDescricao());
     //setando imagem na label
        try {
         //pego os bytes do objeto de tipo post e converto ele para valores que faze sentido para o java um tipo que faz sentido para o java
         //vai entrando byte por byte e deixa agrupado                                                  //traz bytes de um post   
         InputStream entraBytes = new ByteArrayInputStream(this.post.getBinarioImagem());
         BufferedImage preImagem = ImageIO.read(entraBytes); //costro pre imagem
         ImageIcon imagem = new ImageIcon(preImagem); //imagem em si
         //setando imagem na label
         this.labelImagemPost.setIcon(imagem);
            //relacionado a trazer um usuario dono do post
            try {
               //como cada post tem um usuario relacionado que postou eu puxo para cada post que vim um usuario relacionado a esse post que
               //postou
               this.conexao = new ConexaoBancoDeDados();
               this.conexao.conectar();
               //preparando uma consulta para trazer um usuario
                PreparedStatement trazUmUsuarioDonoPost = this.conexao.getConnection().prepareStatement("SELECT nome FROM pessoa WHERE codigo_id = ?;");
                trazUmUsuarioDonoPost.setInt(1,this.post.getFk_pessoa());//setando o id da pessoa que quero trazer na condição
                ResultSet resultadoConsulta = trazUmUsuarioDonoPost.executeQuery();
                if(resultadoConsulta.next()) {
                  this.labelNomeUsuarioPost.setText(resultadoConsulta.getString(1));
                }
            } catch (SQLException e) {
               e.printStackTrace();
            }     
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeUsuarioPost = new javax.swing.JLabel();
        labelDescricaoPost = new javax.swing.JLabel();
        labelImagemPost = new javax.swing.JLabel();
        botaoCurtirPost = new javax.swing.JButton();

        labelNomeUsuarioPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario!"));

        labelDescricaoPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição Post!"));

        labelImagemPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem Post!"));

        botaoCurtirPost.setText("Dar Like!");
        botaoCurtirPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCurtirPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNomeUsuarioPost, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCurtirPost, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDescricaoPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelImagemPost, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(botaoCurtirPost)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNomeUsuarioPost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(labelDescricaoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCurtirPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCurtirPostActionPerformed
     //botão em que esta no panel Interno e que tem função de dar like em um post
        try {
        //vou inserir no banco de dados na tabela like um like de alguem em um post
        //verifica se o caraa apertou no botão
        if(evt.getSource() == this.botaoCurtirPost) {
           this.conexao = new ConexaoBancoDeDados(); //istancio uma nova conexão
           this.conexao.conectar();//conecta ao banco
           PreparedStatement inseriLike = this.conexao.getConnection().prepareStatement("INSERT INTO like_post(fk_pessoa, fk_post, data_like) VALUES (?, ?,now());"); 
            //setando o usuario que vai dar like no post no ponto de interrogação
            inseriLike.setInt(1,this.usuarioVaiDarLike.getId());
            //iserindo o id do post que vai receber o like
            inseriLike.setInt(2,this.post.getId_post());
            //tentando pegar data e hora do sistema
                           //converte para a data do sql //pega data e hora local
            //inseriLike.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
            //iserindo a data na cosulta na coluna 3
            inseriLike.executeUpdate(); //executado consulta
            inseriLike.close(); //fechando a consulta, para não ficar cosumindo recursos
        }
            
        } catch (SQLException e) {
               e.printStackTrace();
        }catch(NullPointerException e) {
              e.printStackTrace();
        }
        
    }//GEN-LAST:event_botaoCurtirPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCurtirPost;
    private javax.swing.JLabel labelDescricaoPost;
    private javax.swing.JLabel labelImagemPost;
    private javax.swing.JLabel labelNomeUsuarioPost;
    // End of variables declaration//GEN-END:variables
}
