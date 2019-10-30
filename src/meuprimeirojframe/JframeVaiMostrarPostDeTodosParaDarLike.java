//tela que vai ter opção para dar like em qualquer post de qualquer ususario atraves de um painel de layuot de fluxo envolvendo
// um panel interno
package meuprimeirojframe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JframeVaiMostrarPostDeTodosParaDarLike extends javax.swing.JFrame {
     
    private UsuarioDataBase usuarioPrincipalQueVaiDarLike;
    //usuario que veio para dar like em um post qualquer
    private ClassePost post;
    //objeto que sempre vai conter um post atual sendo avalido pelo while
    private  ConexaoBancoDeDados  con; //objeto que vai ter a conexão
    //private PanelParaVerPostEDarLike panelMostraPost = new ;//tipo panel interno
    public JframeVaiMostrarPostDeTodosParaDarLike() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
       
    }
    public JframeVaiMostrarPostDeTodosParaDarLike(UsuarioDataBase e) {
        initComponents();
        this.usuarioPrincipalQueVaiDarLike = e;
         mostrarTodosPosts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelParaMostrarPost = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoNãoDarLikeSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(painelParaMostrarPost);

        jLabel1.setText("                                                              Todos os Posts Da Rede Social Disponiveis Par Dar Like!");

        botaoNãoDarLikeSair.setText("Cancelar, Não dar Like!");
        botaoNãoDarLikeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNãoDarLikeSairActionPerformed(evt);
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
                        .addComponent(botaoNãoDarLikeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(botaoNãoDarLikeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNãoDarLikeSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNãoDarLikeSairActionPerformed
     //se o usuario não quiser dar like ele retorna para a tela princiapal
     TelaPrincipalDoSistemaAlteraCadastro principal = new TelaPrincipalDoSistemaAlteraCadastro(this.usuarioPrincipalQueVaiDarLike);
     principal.setVisible(true);
     dispose();
    }//GEN-LAST:event_botaoNãoDarLikeSairActionPerformed
    //metodo que chama o painel interno e istancia um e adiciona ele na minha tela atraves de um painel da tela sendo que no painel
    //daqui contem um layout de fluxo e vai poder vir quantos quiser e adicono o panel iterno separado nele.
    public void mostrarTodosPosts() {
     //fazendo uma conexaõ para puxar todos os posts
        try {
           con = new ConexaoBancoDeDados();
            con.conectar();
            PreparedStatement consultaTrazTudo = this.con.getConnection().prepareStatement("SELECT id_post,fk_pessoa,descricao,imagem FROM post;");
            ResultSet resultadoConsulta = consultaTrazTudo.executeQuery();
            while(resultadoConsulta.next()) {
                //populando um post atual sendo avalido para o panel interno
                post = new ClassePost();
                post.setBinarioImagem(resultadoConsulta.getBytes(4));
                post.setDescricao(resultadoConsulta.getString(3));
                post.setId_post(resultadoConsulta.getInt(1));
                post.setFk_pessoa(resultadoConsulta.getInt(2));
                PanelParaVerPostEDarLike panelMostraPost = new PanelParaVerPostEDarLike(this.post,this.usuarioPrincipalQueVaiDarLike);
                this.painelParaMostrarPost.add(panelMostraPost);
            }
        } catch (SQLException e) {
                 e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNãoDarLikeSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelParaMostrarPost;
    // End of variables declaration//GEN-END:variables
}
