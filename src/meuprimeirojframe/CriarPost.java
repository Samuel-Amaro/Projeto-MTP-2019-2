package meuprimeirojframe;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CriarPost extends javax.swing.JFrame {
    
    //objeto de tipo usuario que vem por parametro ao chamar esssa tela
    private UsuarioDataBase userPrincipal;
    //objeto onde ficara gurdado as informações do arquivo tamnaho, tipo, etc...
    private File arquivo;
    //objeto de tipo FileChoser, atraves dele pode se escolher uma imagem no disco rigido
    private JFileChooser escolheImageFileChooser;
    //atributo de tipo conexão
    private ConexaoBancoDeDados conection;
    
    public CriarPost() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public CriarPost(UsuarioDataBase usuario) {
        initComponents();
        setLocationRelativeTo(null); //deixa tela centralizada
        //setando usuario do parametro ao atributo
        this.userPrincipal = usuario;
        //objeto de tipo FileChoser, atraves dele pode se escolher uma imagem no disco rigido
        escolheImageFileChooser = new JFileChooser();
        //atribuindo ao meu atributo de tipo conexão uma conexão com o banco de dados
        this.conection = new ConexaoBancoDeDados(this.userPrincipal);
        //exibindo imagem na tela
        //this.mostrarImagemNaLabel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        etiquetaParaDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoDescricaoPost = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botaoEscolherImagem = new javax.swing.JButton();
        labelMostraImagem = new javax.swing.JLabel();
        botaoConfirmaCriacaoDoPost = new javax.swing.JButton();
        botaoCancelaCriacaoDoPost = new javax.swing.JButton();
        etiquetaDeMensagemDeAvizo = new javax.swing.JLabel();
        botaoMostraImagem = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaParaDescricao.setText("      Descrição do Post, so pode Digitar 140 Caracteres");

        areaTextoDescricaoPost.setColumns(20);
        areaTextoDescricaoPost.setRows(5);
        areaTextoDescricaoPost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoDescricaoPostKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areaTextoDescricaoPostKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(areaTextoDescricaoPost);

        jLabel1.setText("    Escolha uma imagem para seu Post");

        botaoEscolherImagem.setText("Escolher Imagem:");
        botaoEscolherImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolherImagemActionPerformed(evt);
            }
        });

        botaoConfirmaCriacaoDoPost.setText("Confirma Criação Do Post!");
        botaoConfirmaCriacaoDoPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaCriacaoDoPostActionPerformed(evt);
            }
        });

        botaoCancelaCriacaoDoPost.setText("Cancelar!");
        botaoCancelaCriacaoDoPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelaCriacaoDoPostActionPerformed(evt);
            }
        });

        botaoMostraImagem.setText("Mostrar Imagem");
        botaoMostraImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostraImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(botaoEscolherImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(etiquetaDeMensagemDeAvizo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoMostraImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelMostraImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botaoConfirmaCriacaoDoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botaoCancelaCriacaoDoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(etiquetaParaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etiquetaParaDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoEscolherImagem)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(etiquetaDeMensagemDeAvizo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botaoMostraImagem))
                .addGap(15, 15, 15)
                .addComponent(labelMostraImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmaCriacaoDoPost)
                    .addComponent(botaoCancelaCriacaoDoPost))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelaCriacaoDoPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelaCriacaoDoPostActionPerformed
       //apertou no botão cancelar volta para a tela principal do sistema
       TelaPrincipalDoSistemaAlteraCadastro tps = new TelaPrincipalDoSistemaAlteraCadastro(this.userPrincipal);
       tps.setVisible(true);
       dispose();
    }//GEN-LAST:event_botaoCancelaCriacaoDoPostActionPerformed

    private void botaoEscolherImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolherImagemActionPerformed
        //aqui e onde usuario escolhe uma imagem para seu post, e escolhida atraves do disco rigido
        //verifica se o objeto de tipo eventtem uma chamada desse botão
        if(evt.getSource() == this.botaoEscolherImagem) {
           //esse cara abaixo ele abre a caixa de eecolha de imagem no disco rigido e retorna uma costante so que em formato de numero
           //ele detecta se eu escolhe algo ou não na caixa de dialogo
           int retorno = this.escolheImageFileChooser.showOpenDialog(this);
           //A variavel de tipo retorno tem que ser == a verdadeiro a essa costante, abaixo, tipo tem que ter escolhido algum arquivo
           // eu comparo isso com a costante QUE POSSUI UM VALOR DE QUE ALGO FOI ESCOLHIDO
           if(retorno == JFileChooser.APPROVE_OPTION){
              //se tiver escolhido algum arquivo eu guardo as informações do arquivo, tamanho, tipo etc.., escolhido no objeto de tipo file de tipo arquivo
                                        //esse cara retorna o arquivo selecionado atraves do file choser 
              this.arquivo = this.escolheImageFileChooser.getSelectedFile();
              //guardo as informações da imagem selecionada no objeto de tipo file
              //e ja salvo meu post no banco de dados logo aqui nesse cara
             salvarArquivoBD();
           }
           else{
                //se não escolheu nada mando uma mensagem
                this.etiquetaDeMensagemDeAvizo.setText("Cancelado escolha de imagem!");
                //atribuo a retorno a opção cancelada, não escolheu imagem
                //retorno = JFileChooser.CANCEL_OPTION;
              }
        }
    }//GEN-LAST:event_botaoEscolherImagemActionPerformed

    private void botaoConfirmaCriacaoDoPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaCriacaoDoPostActionPerformed
       //botão que aqui e aonde o cara confirma a criação do post
       //criou descrição e pegou a imagem necessaria salvo o post no banco de dados
       //salvarArquivoBD();
       //e logo depois mostro a imagem
       //mostrarImagemNaLabel();
       
       
    }//GEN-LAST:event_botaoConfirmaCriacaoDoPostActionPerformed

    private void areaTextoDescricaoPostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoDescricaoPostKeyPressed
    //aqui esta implemetando um evento que apos a cada digitar de um teclado pega o evento
     int qtdCaracterePermitidos = 140;
     if(this.areaTextoDescricaoPost.getText().length() >= qtdCaracterePermitidos) {
         //evt.consume();
         JOptionPane.showMessageDialog(null,"So e permitido digitar 140 caracteres!");
         //vai ficar aparecendo ate o cara desistir de digitar mais de 140 caracteres
     }
    
    }//GEN-LAST:event_areaTextoDescricaoPostKeyPressed
    
    //limitando area de texto para receber so 140 caracteres 
    private void areaTextoDescricaoPostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoDescricaoPostKeyTyped
        /*int qtdCaracterePermitidos = 140;
        if(this.areaTextoDescricaoPost.getText().length() >= qtdCaracterePermitidos) {
           evt.consume();
            JOptionPane.showMessageDialog(null,"So e permitido digitar 140 caracteres!");
            //vai ficar aparecendo ate o cara desistir de digitar mais de 140 caracteres
        }*/
    }//GEN-LAST:event_areaTextoDescricaoPostKeyTyped

    private void botaoMostraImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostraImagemActionPerformed
       mostrarImagemNaLabel();
    }//GEN-LAST:event_botaoMostraImagemActionPerformed
    
     //metodo que salva arquivo e descriçaõ do post no banco de dados
     public void salvarArquivoBD(){
                                
      //cria uma conexão com o banco de dados
      ConexaoBancoDeDados conexao = new ConexaoBancoDeDados(this.userPrincipal);
         try {
             //gurda os bytes da imagem selecionda nesse cara
             //fluxo de entrada de arquivo
             FileInputStream guardaBytesArquivo = new FileInputStream(this.arquivo);
             //chamando o metodo conexão para conectar ao banco de dados
             conexao.conectar();
             //prepaarando consulta de inserção do post no banco de dados
             PreparedStatement ps = conexao.getConnection().prepareStatement("INSERT INTO post (fk_pessoa,descricao,imagem) VALUES (?, ?, ?);");
             //setando os pontos de interrogação na consulta
             ps.setInt(1,this.userPrincipal.getId()); //setando id da pessoa relacionada ao post
             //o texto da caixa de texto esta em chararray,para tirar texto da caixa de texto e trasforma para string uso uma variavel
             String descricaoPost;
             descricaoPost = this.areaTextoDescricaoPost.getText();
             ps.setString(2,descricaoPost);//setando variavel em formato de string na consulta
             //setando imagem na consulta                 //retorna o tamanho do arquivo em bytes
             ps.setBinaryStream(3,guardaBytesArquivo,(int)this.arquivo.length());
             //salvando no banco de dados, e executando a consulta atraves desse cara
             ps.executeUpdate();
             //fecha consulta sql e fileinput strin para liberar recursos do computador
             ps.close();
             guardaBytesArquivo.close();
             //this.mostrarImagemNaLabel();
         //o tratamento dos erros e exçeçoes ocorrerão aqui sera tratada 3 tipos de execeções difeentes relacionadas ao mesmo try    
         } catch (SQLException e) {
            //relacionada ao banco de dados
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao Salvar o Post!");
         } catch(FileNotFoundException e) {
            //exeção que trata um arquivo selecionado que possui allguma falha, e quando não deixa abrir o arquivo, ou ele existe so que
            //não pode ser acessado relacionado a arquivo essa exception a o fileinput e outputStrem
            JOptionPane.showMessageDialog(null,"o arquivo selecionado possui alguma falha!");
         } catch(IOException e) {
            //EXCEÇÃO A SER TRATADA PARA QUEM CHMAR O METODO EXCEÇÃO RELACIONADA A ENTRADA E SAIDA DO CONSOLE
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao Escolher o arquivo!");
         } 
          
      
     }

     //apos escolher imagem tenho que costrui a imagem na label para usuario ver como esta
     //vou fazer atraves do metodo que vai puxar a imagem relacionada  a pesssoa tal e evou costrui a imagem na label
     
     //vai puxar um post especifico de uma pessoa especifica e vai pegar a imagem desse post em binario e vai costrui ela na label 
     //atraves desse metodo
     public void mostrarImagemNaLabel() {
         try {
             //vai trazer id da pessoa, e o binario da imagem
             PreparedStatement consultaPuxaImagem = this.conection.getConnection().prepareStatement("SELECT (id_post,imagem) FROM post WHERE fk_pessoa = ?;");
             consultaPuxaImagem.setInt(1,this.userPrincipal.getId());
             //guardara o resultado da consulta select,esse objeto pode conter varios resultados mas nesse caso so pode ter um resultado
             ResultSet guardaResultado = consultaPuxaImagem.executeQuery();
             //para achar o resultado pode iterar a variavel para ver se encontra algum resultado
             if(guardaResultado.next()) {
                 //se tiver um resultado pega esse resultado e puxa o binario da coluna imagem de acordo com a consulta
                 byte[] binario = guardaResultado.getBytes(2);
                                            //vai fornecendo bytes em formato de fluxo de array binario, vai entrando byte por byte                  
                 InputStream entradaBytes = new ByteArrayInputStream(binario);
                 //costroi a imagem atraves dos bytes recebidos pelo fluxo de entrada
                 BufferedImage imagem = ImageIO.read(entradaBytes);
                                        //vai codifica e decodifica os binarios da imagem,read(vai pegar um arquivo e costrui ele atraves do fluxo de entrada de binarios);
                 ImageIcon iconeDaImagem = new ImageIcon(imagem);
                 //pre-carrega a imagem como um icone
                 //setando a IMAGEM  vinda do banco de dados e costruida aqui, NESSE METODO, MOSTRANDO ELA na label para ver
                 this.labelMostraImagem.setIcon(iconeDaImagem); // a lebel recebe a imagem costruida
             }
         //tratando exception que pode ocorrer
         } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Ao costruir imagem para Visuallização, Não Deu Certo!");
         } catch(IOException E) {
           JOptionPane.showMessageDialog(null,"Arquivo selecionado possui alguma falha");
         } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null,"ocorreu um erro inesperado!");
         }
         
     } 
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoDescricaoPost;
    private javax.swing.JButton botaoCancelaCriacaoDoPost;
    private javax.swing.JButton botaoConfirmaCriacaoDoPost;
    private javax.swing.JButton botaoEscolherImagem;
    private javax.swing.JButton botaoMostraImagem;
    private javax.swing.JLabel etiquetaDeMensagemDeAvizo;
    private javax.swing.JLabel etiquetaParaDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelMostraImagem;
    // End of variables declaration//GEN-END:variables
}
