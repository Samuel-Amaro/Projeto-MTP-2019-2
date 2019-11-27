//painel interno que ira possui todas  as caracteristicas de mostrar um post na tela principal
//porque painel interno?
//porque ele e instanciado para a tela principal dentro de outros componetes da tela principal
package meuprimeirojframe;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MostrarPost extends javax.swing.JPanel {

    //atributos necessarios
    private UsuarioDataBase user; //do tipo usuario
    private ClassePost post; //do tipo post 
    private PupularLikePost like;

    public MostrarPost() {
        initComponents();
    }

    //user e um objeto de tipo usuario vindo por parametro para metodo costrutor post e um objeto de tipo post vindo como parametro
    public MostrarPost(UsuarioDataBase user, ClassePost cp) {
        initComponents();
        this.user = user;//usuario logado
        this.post = cp;//atul post que vai ser mostrado
        //setando um post completo na panel,com descrição nome e imagem se tiver
        //setando um nome na label
        this.labelNomeUsuario.setText(this.user.getNome());
        //setando uma descrição numa label
        this.labelDescricao.setText(this.post.getDescricao());
        //mostrando um numero de likes que um post atual tem, o numero de likes vem por meio de uma sub consulta e guardado em um objeto de tipo post
        this.labelMostraLikes.setText(Integer.toString(this.post.getNumeroLikes()));
        //formatando uma data do post postado
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //mostrando a data no panel 
        this.mostraData.setText("Em:" + formato.format(this.post.getData()));
        //verificando se um post que vem e so de texto ou so de imagem
        //verificando o post que vem e vendo se tem imagem ou não
        if (this.post.getBinarioImagem() != null) {//se tiver imagem
            try {
                //setando a imagem do post na label
                //os binarios da imagem que vem do banco de dados e são convertidos em bytes para fazer sentido para o java eu mando eles para
                // o imputy para costrui a imagem em entrada de bytes em fluxo
                //(ler byte por byte)      
                InputStream entradaBytes = new ByteArrayInputStream(this.post.getBinarioImagem());
                //costruindo imagem para mostrar na label
                BufferedImage imagem = ImageIO.read(entradaBytes);
                //le e grava imagem, e decodifica e codifica imagem, le o fluxo de bytes codifica ele em imagem
                ImageIcon iconeDaImage = new ImageIcon(imagem);
                //vai costruindo  a imagem byte por byte pre_carregando ela no costrutor
                //*****************************************************************//
                //redimensionando imagem para ficar do tamanho certo da label
                iconeDaImage.setImage(iconeDaImage.getImage().getScaledInstance(567,217,1));
                //mostrando imagem na label
                this.labelMostraImagemPost.setIcon(iconeDaImage);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ocorreu uma falha de saida de bytes do arquivo!");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "objeto vazio!");
            }
        } //se o post não tiver imagem
        else {
            this.labelMostraImagemPost.setText("Esse Post não Possui Imagem!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeUsuario = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelMostraImagemPost = new javax.swing.JLabel();
        mostraData = new javax.swing.JLabel();
        labelMostraLikes = new javax.swing.JLabel();
        botaoMostraLikes = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(702, 32767));

        labelNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMostraImagemPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mostraData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoMostraLikes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meuprimeirojframe/imagens/botaoCurtirRede (1).png"))); // NOI18N
        botaoMostraLikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostraLikesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostraData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoMostraLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMostraLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostraData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoMostraLikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMostraLikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMostraLikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostraLikesActionPerformed
        //botão com imagem de curtir
        //ao clicar nele mostrara os likes recebidos no referido post
        if (evt.getSource() == this.botaoMostraLikes) {
            //clicou no botão vai para a tela de visualização de likes, passsando um usuario logado e um post atual que tem curtidas
            TelaVisualizacaoDosLikes mostraLikes = new TelaVisualizacaoDosLikes(this.user,this.post);
            mostraLikes.setVisible(true);//deixando a tela visivel
        }
            
    }//GEN-LAST:event_botaoMostraLikesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMostraLikes;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMostraImagemPost;
    private javax.swing.JLabel labelMostraLikes;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel mostraData;
    // End of variables declaration//GEN-END:variables
}
