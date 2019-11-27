//painel interno que vai mostra os likes recebidos referente a um post
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

public class JPanelMostraLikesRecebidos extends javax.swing.JPanel {
    private PupularLikePost like;//objeto de tipo like
    public JPanelMostraLikesRecebidos(PupularLikePost like) {
        initComponents();
        this.like = like;//pego oque vem por parametro e passo para o meu objeto
        //setado as informações de quem deu like no post no meu painel para mostrar
        UsuarioDataBase userDeuLike = new UsuarioDataBase();//objeto de tipo usuario
        userDeuLike.setId(this.like.getFk_Pessoa_Deu_Like());//guardo em meu objeto de tipo usuario, o id da pessoa que deu like, no post
        //e logo em seguida faço uma busca no banco de dados para mostrar informações sobre ele
        try {
            ConexaoBancoDeDados con = new ConexaoBancoDeDados(userDeuLike);
            con.conectar();
            PreparedStatement trazUsuarioDeuLike = con.getConnection().prepareStatement("SELECT codigo_id, nome, email, senha, telefone, cidade_estado, foto_perfil FROM pessoa WHERE codigo_id = ?;");
            trazUsuarioDeuLike.setInt(1,userDeuLike.getId());//setando na consulta o usuario que quero buscar as informações
            ResultSet trazUsuario = trazUsuarioDeuLike.executeQuery();
            if(trazUsuario.next()) {
               UsuarioDataBase usuarioDeuLike = new UsuarioDataBase();
               usuarioDeuLike.setNome(trazUsuario.getString(2));//so preciso do nome do usuario que deu like
               usuarioDeuLike.setBinarioFotoPerfil(trazUsuario.getBytes(7));//setando no objeto de tipo usuario a foto de perfil dele se ele tiver
               //mostrando foto de perfil se ele tiver
               if(usuarioDeuLike.getBinarioFotoPerfil() != null) {
                   try{
                   InputStream bytesImagem = new ByteArrayInputStream(usuarioDeuLike.getBinarioFotoPerfil()); //agrupa os bytes da imagem
                   BufferedImage imagem = ImageIO.read(bytesImagem);//imagem em buffer ja montada
                   ImageIcon iconeImage = new ImageIcon(imagem);//icone da imagem
                   //REDIMENSIONANDO IMAGEM
                   iconeImage.setImage(iconeImage.getImage().getScaledInstance(159,136,1));//tamanho da label
                   //mostrando imagem na label
                   this.labelFotoPerfil.setIcon(iconeImage);
                   }catch(IOException e) {
                         JOptionPane.showMessageDialog(null,"ocorreu um erro ao mostrar sua foto de perfil!");
                   }
               }else {
                   this.labelFotoPerfil.setText("Não tem imagem de perfil!");
               }
               
               this.labelMostraNomeDeQuemDeuLike.setText(usuarioDeuLike.getNome());//mostrando nome na label
               //formatando uma data do like dado
               SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
               this.labelMostraData.setText("Em:" + formato.format(this.like.getDataDoDia()));//mostrando a data na label
            }
        } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"ocorreu um erro ao buscar usuario que deu like!");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelFotoPerfil = new javax.swing.JLabel();
        labelMostraNomeDeQuemDeuLike = new javax.swing.JLabel();
        labelMostraData = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMostraNomeDeQuemDeuLike.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelMostraData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMostraNomeDeQuemDeuLike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMostraData, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMostraNomeDeQuemDeuLike, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelMostraData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFotoPerfil;
    private javax.swing.JLabel labelMostraData;
    private javax.swing.JLabel labelMostraNomeDeQuemDeuLike;
    // End of variables declaration//GEN-END:variables
}
