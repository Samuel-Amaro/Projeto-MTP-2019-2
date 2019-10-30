//tela de cadastro caso um usuario não esteja cadastrado, e para alteração de cadastro tambem
package meuprimeirojframe;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    private UsuarioDataBase userCadastro; //um atributo global do tipo usuario
    private UsuarioDataBase userAux;//usado para comparação de objeto vazio    
    
    //metodo costrutor que costrui a tela
    public TelaCadastro() {
        initComponents(); //inicia componentes
        setLocationRelativeTo(null); // para a tela ficar centralizada
    }

    //um metodo costrutor que recebe um parametro de tipo objeto de usuario vindo de um istanciamento qualquer
    //alteração de cadastro de um usuario qualquer
    //esse metodo costrutor vai colocar todas as informações de um objeto de tipo usuario vindo por parametro, em todos textfild da tela de cadastro
    public TelaCadastro(UsuarioDataBase user) {
        this.userCadastro = user; //o atributo recebe o objeto
        initComponents(); //inicia componentes
        setLocationRelativeTo(null);
        //em termos de alterar cadastro eu recebo um objeto como parametro de tipo usuario que contera todas as informações nele
        this.campoTextoNomeCompletoTelaCadastro1.setText(this.userCadastro.getNome());
        // eu pego esse objeto e seto uma respectiva informação dele em um campo de texto da tela cadastro sendo respectiva a informação
        this.campoTextoTelefone2TelaCadastro.setText(this.userCadastro.getTelefone());
        //setando telefone na tela de cadastro
        this.campoTextoEmail3.setText(this.userCadastro.getEmail());
        //setando email na tela de cadastro
        this.campoTexto4CidadeEstado.setText(this.userCadastro.getCidadeEstado());
        //setando cidade estado na tela de cadastro
        this.jPasswordFieldSenha1.setText(this.userCadastro.getSenha());
        //senha primeira confirma
        this.confirmaSenha2.setText(this.userCadastro.getSenha());
        
         //logo de inicio eu verifico se existe um email ja registrado aqui no metodo costrutor
        //se a caixa de texto setada por esse metodo costrutor estiver vazia e sinal de que não tem email registrado
        if(this.campoTextoEmail3.equals("")) {
           this.campoTextoEmail3.setEnabled(true);
        }
        //se tiver um email regitrado e caixa de texto com texto em email eu deixo ela ineditavel para não ser editavel
        else {
            this.campoTextoEmail3.setEnabled(false);
        }
        //isso aconteçe porque o email no BD E unick e uncio não pode ser alterado.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTextoNomeCompletoTelaCadastro1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTextoTelefone2TelaCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTextoEmail3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTexto4CidadeEstado = new javax.swing.JTextField();
        jPasswordFieldSenha1 = new javax.swing.JPasswordField();
        confirmaSenha2 = new javax.swing.JPasswordField();
        botao2CancelaCadastro = new javax.swing.JButton();
        botaoParaTestarCadastroAposFeito = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelQueMostraImagem = new javax.swing.JLabel();
        botaoParaEscolherImagemPerfil = new javax.swing.JButton();
        botao1ConfirmaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoTexto1.setText("Cadastro De Um Novo Usuario(a)!");

        jLabel1.setText("    Nome Completo");

        campoTextoNomeCompletoTelaCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNomeCompletoTelaCadastro1ActionPerformed(evt);
            }
        });

        jLabel2.setText("    Telefone:");

        campoTextoTelefone2TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoTelefone2TelaCadastroActionPerformed(evt);
            }
        });

        jLabel3.setText("    E-Mail:");

        campoTextoEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoEmail3ActionPerformed(evt);
            }
        });

        jLabel4.setText("   Cidade/Estado :");

        jLabel5.setText("         Senha:");

        jLabel6.setText("  Confimar-senha:");

        campoTexto4CidadeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto4CidadeEstadoActionPerformed(evt);
            }
        });

        botao2CancelaCadastro.setText("Cancelar,Cadastro!");
        botao2CancelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2CancelaCadastroActionPerformed(evt);
            }
        });

        botaoParaTestarCadastroAposFeito.setText("Fazer Login!");
        botaoParaTestarCadastroAposFeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoParaTestarCadastroAposFeitoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolher Foto Para Perfil!"));

        botaoParaEscolherImagemPerfil.setText("escolher imagem para perfil!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQueMostraImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botaoParaEscolherImagemPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQueMostraImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(botaoParaEscolherImagemPerfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao1ConfirmaCadastro.setText("Confirma,Cadastro!");
        botao1ConfirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ConfirmaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoTexto1)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao2CancelaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoParaTestarCadastroAposFeito, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(botao1ConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTextoTelefone2TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoNomeCompletoTelaCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTexto4CidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoNomeCompletoTelaCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoTelefone2TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTexto4CidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao2CancelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao1ConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoParaTestarCadastroAposFeito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoNomeCompletoTelaCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNomeCompletoTelaCadastro1ActionPerformed
        //this.campoTextoNomeCompletoTelaCadastro1.setText(this.userCadastro.getNome());
    }//GEN-LAST:event_campoTextoNomeCompletoTelaCadastro1ActionPerformed

    private void botao2CancelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2CancelaCadastroActionPerformed
        //istanciando tela secunadaria, de inicio, ao clicar no botão cancelar
        //criando nova tela de inicio para voltar
        //TelaPrincipalDoSistemaAlteraCadastro tipm = new TelaPrincipalDoSistemaAlteraCadastro(this.userCadastro);
        //tipm.setVisible(true); //deixando ela visivel
        //dispose(); //encerrando tela atual de cadastro
        
        //vendo se as caixas de texto estão vazias para voltar para a tela de login
        if(this.campoTextoNomeCompletoTelaCadastro1.getText().equals("") && this.campoTextoTelefone2TelaCadastro.getText().equals("") && this.campoTextoEmail3.getText().equals("") && this.campoTexto4CidadeEstado.getText().equals("") && new String(this.jPasswordFieldSenha1.getPassword()).equals("") && new String(this.confirmaSenha2.getPassword()).equals("")) {
            //vai verificar se todas as caixas de textos estão vazias se tiver não deixa cadastrar
            TelaLoginUm login = new TelaLoginUm();
            login.setVisible(true);
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(null,"Seria Bom se apaguasse os dados Não usados nas caixas!");
            TelaLoginUm login = new TelaLoginUm();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botao2CancelaCadastroActionPerformed

    
    private void botao1ConfirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ConfirmaCadastroActionPerformed
      //antes de alterar ou cadastrar uma pessoa devo verificar se não quer inserir uma pessoa nula não preencheu nehum dado
      if(this.campoTextoNomeCompletoTelaCadastro1.getText().equals("") && this.campoTextoTelefone2TelaCadastro.getText().equals("") && this.campoTextoEmail3.getText().equals("") && this.campoTexto4CidadeEstado.getText().equals("") && new String(this.jPasswordFieldSenha1.getPassword()).equals("") && new String(this.confirmaSenha2.getPassword()).equals("")) {
         JOptionPane.showMessageDialog(null,"Cade os Dados Cadastrais Da Pessoa ?");
      }
         //se for inserir um nova pessoa no BD, ou alterar um novo cadastro
        //guardo a senha de cadastro em um objeto de tipo string
        String senha = new String(jPasswordFieldSenha1.getPassword());
        //faço o mesmo para a senha de confirmação
        String confirmaSenha = new String(confirmaSenha2.getPassword());
        //comparo as duas senhas se forem iguais eu cadastro essa pessoa atual no BD
        if (senha.equals(confirmaSenha)) {
            /*apos usuario digitar em todos as caixas de texto seus respectivos dados, tenho que cadastrar esses dados em meu banco de dados do projeto*/
            /*istanciando uma nova conexão para meu banco de dados,retorna um objeto que nele esta contido a conexão com O BD*/
            ConexaoBancoDeDados conectaDataBase = new ConexaoBancoDeDados(this.userCadastro);//passo um objeto de tipo usuario para o BD
            /*apos istancia um objeto de tipo conexão tenho que chamar um metodo especifico que conecta ao database*/
            conectaDataBase.conectar();
            //a exception do metodo inserir e retornada para ca e acaba que tem que trata ela qui. 
            try {
                
                //se um usuario não existe 
                if (this.userCadastro == this.userAux) { //usa o atributo aux para comparar aqui para ver se objeto atual e vazio
                    //se o cara não existe e uma nova pessoa insiro ela no banco de dados
                    //chama o metodo inserir no banco de dados, passo os campos de texto ja prenchidos
                    conectaDataBase.inserirIntoDataBase(campoTextoNomeCompletoTelaCadastro1.getText(), campoTextoEmail3.getText(), new String(jPasswordFieldSenha1.getPassword()), campoTextoTelefone2TelaCadastro.getText(), campoTexto4CidadeEstado.getText());
                    //se deu tudo certo mando uma mensagem
                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                    //e atualizo um objeto com todas informações desse cara recem cadastrado para a tela principal do sistema mando esse objeto para la
                    UsuarioDataBase userAux = new UsuarioDataBase();
                    userAux = conectaDataBase.login(this.campoTextoEmail3.getText(),new String(this.jPasswordFieldSenha1.getPassword()));
                    TelaPrincipalDoSistemaAlteraCadastro tps = new TelaPrincipalDoSistemaAlteraCadastro(userAux);
                    tps.setVisible(true);
                    dispose();
                } else {
                    //se o cara ja existe chamo o metodo altera cadastro de conexão
                    try {
                        //chama o metodo alterar no banco de dados, passo os campos de texto ja prenchidos
                        //this.campoTextoEmail3.setEditable(false);
                        conectaDataBase.alteraCadastro(campoTextoNomeCompletoTelaCadastro1.getText(), new String(jPasswordFieldSenha1.getPassword()), campoTextoTelefone2TelaCadastro.getText(), campoTexto4CidadeEstado.getText());
                        //se deu tudo certo mando uma mensagem que alteração foi feita
                        JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");
                        //se de certo a atualização eu ja crio um novo objeto e ja mando para tela principal uma cara atualizado
                        UsuarioDataBase usuarioAtualizado = new UsuarioDataBase();
                        //atualizando um objeto usuario que apos altera eu atualizo ele para mandar para tela principal
                        usuarioAtualizado.setNome(this.campoTextoNomeCompletoTelaCadastro1.getText());
                        usuarioAtualizado.setCidadeEstado(this.campoTexto4CidadeEstado.getText());
                        usuarioAtualizado.setEmail(this.campoTextoEmail3.getText());
                        usuarioAtualizado.setTelefone(this.campoTextoTelefone2TelaCadastro.getText());
                        usuarioAtualizado.setId(this.userCadastro.getId());
                        usuarioAtualizado.setSenha(new String(this.jPasswordFieldSenha1.getPassword()));
                        usuarioAtualizado = conectaDataBase.login(usuarioAtualizado.getEmail(),usuarioAtualizado.getSenha());
                        TelaPrincipalDoSistemaAlteraCadastro tpsa = new TelaPrincipalDoSistemaAlteraCadastro(usuarioAtualizado);
                        tpsa.setVisible(true);
                        dispose();
                    } catch (SQLException e) {
                        //se a alteração não aconteceu eu mostro uma mensagem.
                        JOptionPane.showMessageDialog(null, "Alteração não foi feita!");
                    }
                }
            } catch (SQLException e) {
                //se não deu certo a inserir uma nova, ou cadastrar pessoa mando uma mensagem
                JOptionPane.showMessageDialog(null, "Cadastro não Efetuado!");
            }
        } 
        else {
            //se as senhas estiverem diferentes eu mando uma mensagem para arrumar as senha
            JOptionPane.showMessageDialog(null, "Senhas cadastradas são diferentes,Tem que ser senhas iguais,Não foi Cadastrado Ainda!");
    }//GEN-LAST:event_botao1ConfirmaCadastroActionPerformed
    
   }
    private void campoTextoTelefone2TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTelefone2TelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoTelefone2TelaCadastroActionPerformed

    private void campoTexto4CidadeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto4CidadeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto4CidadeEstadoActionPerformed

    private void botaoParaTestarCadastroAposFeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoParaTestarCadastroAposFeitoActionPerformed
        //ao cadastrar preciso fazer um login para testar por isso esse botão
        TelaLoginUm retornaParaTelaLogin = new TelaLoginUm(); //istanciando nova tela de login
        retornaParaTelaLogin.setVisible(true); //deixa tela visivel
        dispose(); //desfaz da tela atual
    }//GEN-LAST:event_botaoParaTestarCadastroAposFeitoActionPerformed

    private void campoTextoEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoEmail3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campoTextoEmail3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1ConfirmaCadastro;
    private javax.swing.JButton botao2CancelaCadastro;
    private javax.swing.JButton botaoParaEscolherImagemPerfil;
    private javax.swing.JButton botaoParaTestarCadastroAposFeito;
    private javax.swing.JLabel campoTexto1;
    private javax.swing.JTextField campoTexto4CidadeEstado;
    private javax.swing.JTextField campoTextoEmail3;
    private javax.swing.JTextField campoTextoNomeCompletoTelaCadastro1;
    private javax.swing.JTextField campoTextoTelefone2TelaCadastro;
    private javax.swing.JPasswordField confirmaSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha1;
    private javax.swing.JLabel labelQueMostraImagem;
    // End of variables declaration//GEN-END:variables
}
