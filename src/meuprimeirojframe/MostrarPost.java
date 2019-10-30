//painel interno que ira possui todas  as caracteristicas de mostrar um post na tela principal
//porque painel interno?
//porque ele e instanciado para a tela principal dentro de outros componetes da tela principal
package meuprimeirojframe;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MostrarPost extends javax.swing.JPanel {
    
    //atributos necessarios
    private UsuarioDataBase user; //do tipo usuario
    private ClassePost post; //do tipo post 
    public MostrarPost() {
        initComponents();
    }
    //user e um objeto de tipo usuario vindo por parametro para metodo costrutor post e um objeto de tipo post vindo como parametro
    public MostrarPost(UsuarioDataBase user,ClassePost cp) {
      initComponents();
      this.user = user;
      this.post = cp;
      //setando um post completo na panel,com descrição nome e imagem se tiver
      //setando um nome na label
      this.labelNomeUsuario.setText(this.user.getNome());
      //setando uma descrição numa label
      this.labelDescricao.setText(this.post.getDescricao());
      this.mostraLike.setText(Integer.toString(this.post.getNumeroLikes()));
      try{
      //setando a imagem do post na label
      //os binarios da imagem que vem do banco de dados e são convertidos em bytes para fazer sentido para o java eu mando eles para
      // o imputy para costrui a imagem em entrada de bytes em fluxo
                                     //(ler byte por byte)      
      InputStream entradaBytes = new ByteArrayInputStream(this.post.getBinarioImagem());
      //costruindo imagem para mostrar na label
        BufferedImage imagem = ImageIO.read(entradaBytes);
                               //le e grava imagem, e decodifica e codifica imagem, le o fluxo de bytes codifica ele em imagem
        ImageIcon iconeDaImage =  new ImageIcon(imagem);
        //vai costruindo  a imagem byte por byte pre_carregando ela no costrutor
        //mostrando imagem na label
        this.labelMostraImagemPost.setIcon(iconeDaImage);
       }catch(IOException e){
             JOptionPane.showMessageDialog(null,"ocorreu uma falha de saida de bytes do arquivo!");
       }catch(NullPointerException e) {
             JOptionPane.showMessageDialog(null,"ocorreu um erro inesperado! não sei qual e!");
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeUsuario = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelMostraImagemPost = new javax.swing.JLabel();
        mostraLike = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(702, 32767));

        labelNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMostraImagemPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mostraLike.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostraLike, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostraLike))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMostraImagemPost;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel mostraLike;
    // End of variables declaration//GEN-END:variables
}
