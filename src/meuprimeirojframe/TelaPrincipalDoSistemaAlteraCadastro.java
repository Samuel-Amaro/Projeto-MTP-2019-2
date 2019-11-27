//ao entrar na minha tela de login e o login estiver correto, e não ocorre nenhuma exception e nehum erro, ao aparecer minha mensagem de
// sucesso com o login feito corretamente, eu vou istanciar uma nova tela, do tipo altera cadastro com o botão altera cadastro, essa tela aqui
//essa e tela principal do sistema nela ira conter tudo de necessario para o sistema ela por enquanto so faz alterar um cadastro
//tudo de comun entre essas telas e o usuario que agora e uma classe
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

public class TelaPrincipalDoSistemaAlteraCadastro extends javax.swing.JFrame {

    private UsuarioDataBase userPrincipal; //uma atributo global do tipo usuario
    private ConexaoBancoDeDados con;

    //private ClassePost guardaPost;
    public TelaPrincipalDoSistemaAlteraCadastro() {
        initComponents();
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }

    //metodo costrutor que recebe um objeto do tipo usuario
    public TelaPrincipalDoSistemaAlteraCadastro(UsuarioDataBase userAltera) {
        initComponents();
        painelPostInterno.setLayout(new WrapLayout());//mudando o layout para vertical
        this.userPrincipal = userAltera;
        setLocationRelativeTo(null);
        
        //mostra imagem de perfil na tela principal
        //se não tiver imagem mostro uma mensagem
        if(this.userPrincipal.getBinarioFotoPerfil() == null) {
           this.labelMostraFotoPerfil.setText("Não possui Imagem de Perfil!");
        }
        //se tiver imagem mostro a foto
        else {
            try {
                //criando uma conexão
                ConexaoBancoDeDados conection = new ConexaoBancoDeDados(this.userPrincipal);
                conection.conectar();
                //buscando a foto de perfil do usuario atual
                PreparedStatement mostraImagePerfil = conection.getConnection().prepareStatement("SELECT foto_perfil FROM pessoa WHERE codigo_id = ?;");
                //setando no ponto de interrogação o id do usuario
                mostraImagePerfil.setInt(1,this.userPrincipal.getId());
                ResultSet bytesImagem = mostraImagePerfil.executeQuery(); //resultado da consulta
                if(bytesImagem.next()) {
                   byte[] binarioFoto = bytesImagem.getBytes(1);//pegando o binario da imagem
                    InputStream bytesCompletoImagem = new ByteArrayInputStream(binarioFoto);
                    BufferedImage imagemPronta = ImageIO.read(bytesCompletoImagem);
                    ImageIcon iconeImage = new ImageIcon(imagemPronta);
                    //redimensionando imagem
                    iconeImage.setImage(iconeImage.getImage().getScaledInstance(this.labelMostraFotoPerfil.getWidth(),this.labelMostraFotoPerfil.getHeight(),1));
                    this.labelMostraFotoPerfil.setIcon(iconeImage);
                }
            }catch(SQLException e) {
                   JOptionPane.showMessageDialog(null,"ocorreu um erro ao buscar sua imagem de Perfil!");
            }catch(IOException e) {
		   JOptionPane.showMessageDialog(null,"ocorreu um erro ao Mostrar sua imagem de Perfil!");
	    }
            
        }        
        //mostra uma mensagem inicial para o usuario!
        this.labelMostraMensagemInicial.setText("Ola, Bem Vindo " + this.userPrincipal.getNome());
        mostrarPost();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAltera = new javax.swing.JButton();
        retornaParaTelaAnterior = new javax.swing.JButton();
        botaoCriaUmNovoPost = new javax.swing.JButton();
        excluirUmUsuario = new javax.swing.JButton();
        labelMostraFotoPerfil = new javax.swing.JLabel();
        labelMostraMensagemInicial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelPostInterno = new javax.swing.JPanel();
        botaoMostraPostsDeTodoMundo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAltera.setText("Altera,Cadastro?");
        botaoAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteraActionPerformed(evt);
            }
        });

        retornaParaTelaAnterior.setText("Sair Da Rede!");
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

        labelMostraFotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setToolTipText("");

        painelPostInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelPostInternoLayout = new javax.swing.GroupLayout(painelPostInterno);
        painelPostInterno.setLayout(painelPostInternoLayout);
        painelPostInternoLayout.setHorizontalGroup(
            painelPostInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        painelPostInternoLayout.setVerticalGroup(
            painelPostInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(painelPostInterno);

        botaoMostraPostsDeTodoMundo.setText("Ver Posts e Dar Like!");
        botaoMostraPostsDeTodoMundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostraPostsDeTodoMundoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMostraFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelMostraMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(excluirUmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retornaParaTelaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoMostraPostsDeTodoMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoCriaUmNovoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMostraFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCriaUmNovoPost))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelMostraMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAltera)
                        .addGap(18, 18, 18)
                        .addComponent(excluirUmUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(retornaParaTelaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoMostraPostsDeTodoMundo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Usuario Excluido com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario Não foi Excluido!");
        }
    }//GEN-LAST:event_excluirUmUsuarioActionPerformed

    private void botaoCriaUmNovoPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriaUmNovoPostActionPerformed
        CriarPost cp = new CriarPost(this.userPrincipal);
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCriaUmNovoPostActionPerformed

    private void botaoMostraPostsDeTodoMundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostraPostsDeTodoMundoActionPerformed
        // TODO add your handling code here:
        JframeVaiMostrarPostDeTodosParaDarLike teste = new JframeVaiMostrarPostDeTodosParaDarLike(this.userPrincipal);
        teste.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoMostraPostsDeTodoMundoActionPerformed
    //metodo que vai mostrar os ultimos 3 post na tela principal
    public void mostrarPost() {
        //variaveis que vou usar
        ClassePost guardaPost;//objeto de tipo post
        MostrarPost mps;//tipo JpanelInterno
        try {
            con = new ConexaoBancoDeDados(this.userPrincipal);
            con.conectar();                                                                                   //combinação de sub consulta falo para trazer a quantidade de likes
                                                                                                              //de um determinado post, que sempre vai mudar e o id atual da consulta                                                    
            PreparedStatement ps = this.con.getConnection().prepareStatement("SELECT id_post,descricao,imagem,(SELECT count(*) as co FROM like_post where fk_post = id_post),data FROM post where fk_pessoa = ? order by id_post desc LIMIT ?;");
            //setando ponto de interrogação na consulta
            ps.setInt(1, this.userPrincipal.getId());
            ps.setInt(2, 3);
            ResultSet resultado = ps.executeQuery();
            //mostrasndo post de usuario para tela principal de maneira dinamica dentro de um scrolpanel
            while(resultado.next()) {
                //atraves da população do objeto de tipo post, vou setar informações de um post nele e mandar para a jpanel criada que ira receber informações de 
                //post avaliado no laço e mostrar na tela principal
                guardaPost = new ClassePost(); //objeto de tipo classepost
                //setando descrição nele
                guardaPost.setDescricao(resultado.getString(2));
                //setando id
                guardaPost.setId_post(resultado.getInt(1));
                //setando binario da imagem
                guardaPost.setBinarioImagem(resultado.getBytes(3));
                //via combinação de sub consultas de acordo com a consulta
                guardaPost.setNumeroLikes(resultado.getInt(4));
                guardaPost.setData(resultado.getDate(5));//setando o total de likes de um determindo post no objeto
                //istaciando um panel interno para ele passo um usuario e um post atual sendo avaliado pelo flag,e um like recebido dessse post
                mps = new MostrarPost(this.userPrincipal, guardaPost); //istancio um paneldetipo mostraPost
                painelPostInterno.add(mps); //adiciono nele um post
                
            }
            //esxception relacionadas    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um Erro!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "não tem post seu postado e nem criado!");
        }

    }
    /*
    //metodo mostrar total de likes em um post de maneira simples e bem inificente
    public int totalLikesPost(int idPost) {
        ConexaoBancoDeDados conection; //variavel de tipo conexao Banco de dados
        //variavel auxiliar que vai gurda os numeros inteiros de like
        int totalLikes = 0;
        try {
            //istanciando uma conexao
            conection = new ConexaoBancoDeDados(this.userPrincipal);
            //criando a conexão
            conection.conectar();
            //consulta para Trazer o total de likes de um post
            PreparedStatement consultaTrazTotalLikes = conection.getConnection().prepareStatement("SELECT count(*) as co FROM like_post where fk_post = ?;");
            //setando o id do post
            consultaTrazTotalLikes.setInt(1, idPost);
            //executando consulta e trazendo o resultado da consulta
            ResultSet resultadoTotalLikes = consultaTrazTotalLikes.executeQuery();
            //verificando os resultados e repassandos
            if(resultadoTotalLikes.next()) {
                totalLikes = resultadoTotalLikes.getInt(1);
            }
            
            
        } catch (SQLException e) {
                 e.printStackTrace();
        }
        return totalLikes; //retorna o total de likes
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAltera;
    private javax.swing.JButton botaoCriaUmNovoPost;
    private javax.swing.JButton botaoMostraPostsDeTodoMundo;
    private javax.swing.JButton excluirUmUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMostraFotoPerfil;
    private javax.swing.JLabel labelMostraMensagemInicial;
    private javax.swing.JPanel painelPostInterno;
    private javax.swing.JButton retornaParaTelaAnterior;
    // End of variables declaration//GEN-END:variables
}
