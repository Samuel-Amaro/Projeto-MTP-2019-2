//tela que vai ter opção para dar like em qualquer post de qualquer ususario atraves de um painel de layuot de fluxo envolvendo
// um panel interno
package meuprimeirojframe;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JframeVaiMostrarPostDeTodosParaDarLike extends javax.swing.JFrame {
     
    private UsuarioDataBase usuarioPrincipalQueVaiDarLike;
    //usuario que veio para dar like em um post qualquer
    private ClassePost post;
    //objeto que sempre vai conter um post atual sendo avalido pelo while
    private  ConexaoBancoDeDados  con; //objeto que vai ter a conexão
    private Date data; //data do post de tipo date do banco de dados
    public JframeVaiMostrarPostDeTodosParaDarLike() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
       
    }
    public JframeVaiMostrarPostDeTodosParaDarLike(UsuarioDataBase user) {
        initComponents();
        painelParaMostrarPost.setLayout(new WrapLayout());//mudando o layout para vertical
        this.usuarioPrincipalQueVaiDarLike = user;
         mostrarTodosPosts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelParaMostrarPost = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoRetornarParaTelaAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout painelParaMostrarPostLayout = new javax.swing.GroupLayout(painelParaMostrarPost);
        painelParaMostrarPost.setLayout(painelParaMostrarPostLayout);
        painelParaMostrarPostLayout.setHorizontalGroup(
            painelParaMostrarPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        painelParaMostrarPostLayout.setVerticalGroup(
            painelParaMostrarPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(painelParaMostrarPost);

        jLabel1.setText("                                                              Todos os Posts Da Rede Social Disponiveis Par Dar Like!");

        botaoRetornarParaTelaAnterior.setText("Retorna,Tela Anterior!");
        botaoRetornarParaTelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetornarParaTelaAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoRetornarParaTelaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(botaoRetornarParaTelaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRetornarParaTelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetornarParaTelaAnteriorActionPerformed
     //se o usuario não quiser dar like ele retorna para a tela princiapal
     TelaPrincipalDoSistemaAlteraCadastro principal = new TelaPrincipalDoSistemaAlteraCadastro(this.usuarioPrincipalQueVaiDarLike);
     principal.setVisible(true);
     dispose();
    }//GEN-LAST:event_botaoRetornarParaTelaAnteriorActionPerformed
    //metodo que chama o painel interno e istancia um e adiciona ele na minha tela atraves de um painel da tela sendo que no painel
    //daqui contem um layout de fluxo e vai poder vir quantos quiser e adicono o panel interno separado nele.
    public void mostrarTodosPosts() {
     //fazendo uma conexaõ para puxar 3 posts do banco de dados da tabela post
        try {
           con = new ConexaoBancoDeDados();
            con.conectar();
            PreparedStatement consultaTrazTudo = this.con.getConnection().prepareStatement("SELECT id_post,fk_pessoa,descricao,imagem,data FROM post order by id_post desc LIMIT ?;;");
            consultaTrazTudo.setInt(1,3); //setando um limite para trazer so 3 posts ultimos post
            ResultSet resultadoConsulta = consultaTrazTudo.executeQuery();
            while(resultadoConsulta.next()) {
                //populando um post atual sendo avalido para o panel interno
                post = new ClassePost();
                post.setBinarioImagem(resultadoConsulta.getBytes(4));
                post.setDescricao(resultadoConsulta.getString(3));
                post.setId_post(resultadoConsulta.getInt(1));
                post.setFk_pessoa(resultadoConsulta.getInt(2));
                post.setData(resultadoConsulta.getDate(5)); // pegando a data da consulta e setando no objeto
                PanelParaVerPostEDarLike panelMostraPost = new PanelParaVerPostEDarLike(this.post,this.usuarioPrincipalQueVaiDarLike);
                this.painelParaMostrarPost.add(panelMostraPost);
            }
        } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null,"ocorreu um erro ao buscar os posts de usuarios diferentes!");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRetornarParaTelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelParaMostrarPost;
    // End of variables declaration//GEN-END:variables
}
