//painel interno que ira possui todas  as caracteristicas de mostrar um post na tela principal
//porque painel interno?
//porque ele e instanciado para a tela principal dentro de outros componetes da tela principal
package meuprimeirojframe;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
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
    public MostrarPost(UsuarioDataBase user, ClassePost cp) {
        initComponents();
        this.user = user;
        this.post = cp;
        //setando um post completo na panel,com descrição nome e imagem se tiver
        //setando um nome na label
        this.labelNomeUsuario.setText(this.user.getNome());
        //setando uma descrição numa label
        this.labelDescricao.setText(this.post.getDescricao());
        //formatando uma data do post postado
        //mostrando um numero de likes que um post atual tem, o numero de likes vem por meio de uma sub consulta e guardado em um objeto de tipo post
        this.mostraLike.setText(Integer.toString(this.post.getNumeroLikes()));
        //formatando uma data do post postado
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //mostrando a data no panel 
        this.mostraData.setText("Em:" + formato.format(this.post.getData()));
        //verificando se um post que vem e so de texto ou so de imagem
        //verificando o post que vem e vendo se tem imagem ou não
        if(this.post.getBinarioImagem() != null) {
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
                //mostrando imagem na label
                this.labelMostraImagemPost.setIcon(iconeDaImage);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ocorreu uma falha de saida de bytes do arquivo!");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "objeto vazio!");
            }
        }
        //se o post não tiver imagem
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
        mostraLike = new javax.swing.JLabel();
        mostraData = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(702, 32767));

        labelNomeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMostraImagemPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                        .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostraData, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostraLike, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(mostraData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mostraLike, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMostraImagemPost, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelMostraImagemPost;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel mostraData;
    private javax.swing.JLabel mostraLike;
    // End of variables declaration//GEN-END:variables
}
