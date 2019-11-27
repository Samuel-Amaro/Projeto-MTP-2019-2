//CLASSE DE CONEXÃO COM BANCO DE DADOS E SEUS RESPECTIVOS METODOS
package meuprimeirojframe;

import com.sun.javafx.image.impl.ByteArgb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
//CONEXÃO COM BANCO DE SER~ÃO FEITAS PELA jdbc com a interface JAVAcONECTION(INTERFACE DE CONEXÃO)
//UTILIZANDO O POSTGRE/pgadmin
//exemplo de driver e conexão para o postgre
//driver para carregar quando usar BaseDEDADOS POST
//"og.postgresql.Driver"
//CONEXÃO "jdbc:postgresql://localhost/TesteParaProjetoMTP" 1ºTIPO E ENDEREÇO DO BASE DE DADDOS, LOCAL ONDE ESTA NO CASO MINHA MAQUINA, NOME DO USUARIO ATUAL

public class ConexaoBancoDeDados {
    //antes de criar essa classe de conexão com banco de dados,tem que criar um banco de dados antes depois pegar as propriedades e adicionar
    //aqui para conectar

    //atributos
    private String endereco = "jdbc:postgresql://localhost/databasemtp"; //endereço do banco de dado no meu caso e esse ai, se for usuario normal so na maquina so troca o nome da base de dado

    //usuario atual ou qualquer que tiver usando do post
    private String usuario = "postgres";

    //senha definida pelo usuario que estou usando no postgre
    private String senha = "[96284269]Ai";

    //variavel que guarda a conexão
    private Connection conectar1;
    //é a classe que representa a conexão com o bando de dados
    //obs: classe que são estaticas não precisa de istanciar um objeto para usar ela, basta so usar
    /* Metodo construtor.
	 * 
	 * Toda vez que instanciar essa classe, a conexão sera feira automaticamente 
     */
    private UsuarioDataBase usuarioAltera;

    public ConexaoBancoDeDados() {
        conectar();
    }

    //metodo costrutor para ter um objeto de tipo usuario para ter um objeto de tipo usuario para saber quem quero alterar   
    public ConexaoBancoDeDados(UsuarioDataBase user) {
        this.usuarioAltera = user;
    }

    //metodo que fas a conexão com o banco de dados e carrega os Drive necessario, e fas conexão
    public void conectar() {
        try {
            //conecatndo ao banco de dados
            //verifica se o driver do BD existe
            Class.forName("org.postgresql.Driver");
            //passada ao método forName() é o nome completo qualificado da classe que implementa o Driver JDBC de cada banco de
            //dados. Lembrando que cada driver possui um nome diferente, consulte a documentação do fabricante.
            //a partir da conexão bem feita e funcionando posso interagir com o banco de dados, buscando dados, tabelas, informações,consultas etc...
        } catch (ClassNotFoundException e1) { //parametro e uma exceção da biblioteca
            //se não conectar executa essa parada caso de um exceção ou erro
            JOptionPane.showMessageDialog(null, "não conectou ao banco, ainda procure uma classe que funcione!");
        }

        //propriedades do banco de dados, que são necessarias para conectarem
        Properties propriedade = new Properties();
        propriedade.setProperty("user", this.usuario); //propriedade de usuario
        propriedade.setProperty("password", this.senha); //propriedade senha

        //tentando fazer conexão, o metodo que fas conexão com banco de dados realmente
        try {
            this.conectar1 = DriverManager.getConnection(this.endereco, propriedade);//gerencia o driver e cria uma conexão com o banco.
            //DriverManager //classe estatica, não precisa de istanciar um objeto
        } catch (SQLException e) { //recebe uma exceção da biblioteca do javaSql
            //se não conseguir executa isso
            JOptionPane.showMessageDialog(null, "não conectou ao banco!");
        }
        /* EXPLICAÇÃO DO CLASSE E DO METODO
        Connection conn = DriverManager.getConnection(“url”,“usuario”,“senha”);
        Após o carregamento do driver, a classe DriverManager é
        a responsável por se conectar ao banco de dados e
        devolver um objeto Connection, que representa a
        conexão com o BD.
         */
    }

    /**
     * Metodo que retorna a conexÃ£o feita com o BancoDeDados
     *
     * @return um objeto Connection para a conexÃ£o feita com o BD
     */
    //metodo que fas um login OU SO FAS UM SELECT E RETORNA UM NOME DE UMA PESSOA TIPO STRING ao banco de daddos ele pega oque o cara digitou e verifica se esta la e existe, e retorna um nome
    //metodo modificado para agora retorna um usuario logado, retornara um objeto do tipo pessoa
    public UsuarioDataBase login(String email, String senha) {
        try {
            //ps e um objeto que vai receber a consulta preparada, no caso de um select do banco de dados
            PreparedStatement ps = this.conectar1.prepareStatement("SELECT codigo_id,nome,email,senha,telefone,cidade_estado,foto_perfil FROM pessoa WHERE email = ? AND senha = ?;");
            //adicionsndo oque o cara digitar no login ao ponto de interrogação,que vem por meio de parametro do metodo
            ps.setString(1, email); //adiciona os dados vindo por meio do parametro ao primeiro ponto de interrogação 
            ps.setString(2, senha); //mesma coisa so que ao segundo ponto de interrogação
            //(os numeros no argumento do set são pela ordem do ponto de interrogação)
            ResultSet executor = ps.executeQuery();
            //executando uma consulta o select e guardo o resultado da execuçaõ em um objeto executor
            if (executor.next()) {
                //verifica se o meu objeto de tipo Result que tem o resultado da consulta,  tem algum resultado se tem algo dentro dele, se tiver retorna true
                //istanciei um objeto do tipo usuario, nele ira ficar guardado tudo eu busquei do meu banco de dados de um usuario qualquer com
                //email e senha passado, isso e meio que uma seção para deixar tudo que um cara recem logado bem salvo, e usar depois em outra telas
                UsuarioDataBase user = new UsuarioDataBase(); //istanciando um objeto do tipo pessoa
                user.setId(executor.getInt(1)); //no meu objeto eu coloco oque a consulta do BD retorna no caso o id
                user.setNome(executor.getString(2)); //"                                                           "
                user.setEmail(executor.getString(3)); //"                                                          "
                user.setSenha(executor.getString(4));//"                                                            "
                user.setTelefone(executor.getString(5));//"                                                         "
                user.setCidadeEstado(executor.getString(6));//"                                                      "
                user.setBinarioFotoPerfil(executor.getBytes(7));//faz parte nota extra setando binarios da imagem se um usuario tiver foto
                return user; //retorna um usuario
                //retorna um dado de uma consulta o parametro e o campo que quero saber da minha consulta  //retorna um segundo campo da minha consulta que no caso e um nome
                //tem que chamar de seu respectivo tipo e a função em si no caso tem que retorna um mesmo tipo do get 

                //tratando de um novo retorno que sera criado
                /*o metodo login agora tem que retorna tudo que um usuario completo tem*/
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "login no banco de dados não funcionou!");
        }
        return null;
    }

    public Connection getConnection() {
        return this.conectar1;
    }

    /*metodo que fas inserir dados em um banco de dados, não tem parametros esse metodo*/                         //trata uma exception de qualquer tipo que der e manda para quem chamar ele a exception
    public void inserirIntoDataBase(String nome, String email, String senha, String telefone, String cidade_estado) throws SQLException {

        //aqui no try e onde eu digo oque eu vou fazer, oque esse try vai avaliar para ver se o cath acha o erro, e trata o erro ou exceção
        //um objeto que armazenara a consulta que sera realizada ao banco de dados,atraves dele chego ao banco de dados fazendo uma conuslta
        PreparedStatement consultaInseri = this.conectar1.prepareStatement("INSERT INTO pessoa(nome, email, senha, telefone, cidade_estado) VALUES ( ?, ?, ?, ?, ?);"); //Cria um objeto PreparedStatement para enviar instruções SQL com parâmetros para o banco de dados.
        //so acesso o metodo de consulta atraves de um objeto de tipo conexão.    //acima uma consulta de inserção de dados ao banco de dados atraves do metodo prepareStatement vindo por meio do objeto conexão

        //como minha consulta tem parametros e valores a serem passados para o banco de dados eu tenho que
        //receber os dados via parametro pela função inserir e passar os parametros a minha consulta em seus respectivos campos na consulta no caso os campos de interrogação
        // tenho que preenche pega os valores que vem por parametros do metodo inserir e passar a consulta em cada campo
        // por ordem e tem metodos para fazer isso veja abaixo:
        //consultaInseri.setInt(1,3);
        consultaInseri.setString(1, nome); //inserindo o parametro nome, a o  campo nome da consulta sql
        consultaInseri.setString(2, email); //inserindo o parametro email, ao campo email da consulta sql
        consultaInseri.setString(3, senha); //inserindo o parametro senha, ao campo senha da consulta sql
        consultaInseri.setString(4, telefone); //inserindo o parametro telefone, ao campo telefone da consulta sql
        consultaInseri.setString(5, cidade_estado); //inserindo o parametro cidade_estado, ao campo cidade_estado da consulta sql
        consultaInseri.executeUpdate(); //cancela uma consulta qualquer se tiver qualquer exception
        consultaInseri.close(); //fecha os recursos de uma istrução qualquer apos encerrada normalmente

        //tratando uma exceção ou erro que der
        //mostra a propria exceção
    }

    //TEM EXTRA COM REQUISITO MISTURADO AQUI
    //metodo altera cadastro de uma pessoa que ja existe no banco
    //recebe os novos dados quue vão ser atualizados no banco de dados
    public void alteraCadastroSemFoto(String nome, String senha, String telefone, String cidade_estado) throws SQLException {
        PreparedStatement consultaAltera = this.conectar1.prepareStatement("UPDATE pessoa SET  nome=?, senha=?, telefone=?, cidade_estado=?  WHERE codigo_id = ?;");
        //prepara um consulta de tipo atualiza
        //set os parametros nos pontos de interrogação
        consultaAltera.setString(1, nome);
        consultaAltera.setString(2, senha);
        consultaAltera.setString(3, telefone);
        consultaAltera.setString(4, cidade_estado);
        //esse parametro vai para a condição o where
        consultaAltera.setInt(5, this.usuarioAltera.getId());
        consultaAltera.executeUpdate();
        consultaAltera.close();
    }

    //SO REQUISITO
    //metodo altera cadastro de uma pessoa que ja existe no banco com foto de perfil
    //recebe os novos dados que vão ser atualizados no banco de dados
    public void alteraCadastroComFoto(String nome, String senha, String telefone, String cidade_estado, File fotoPerfil) {
        try {
            PreparedStatement consultaAltera = this.conectar1.prepareStatement("UPDATE pessoa SET  nome=?, senha=?, telefone=?, cidade_estado=?, foto_perfil = ?  WHERE codigo_id = ?;");
            //prepara um consulta de tipo atualiza
            //set os parametros nos pontos de interrogação
            consultaAltera.setString(1, nome);
            consultaAltera.setString(2, senha);
            consultaAltera.setString(3, telefone);
            consultaAltera.setString(4, cidade_estado);
            //setando a nova imagem a ser atualizada
            //FileInputStream entradaArquivo; 
            FileInputStream entradaArquivo = new FileInputStream(fotoPerfil);
            consultaAltera.setBinaryStream(5, entradaArquivo, (int) fotoPerfil.length());//setando binario da imagem nova
            //esse parametro vai para a condição o where
            consultaAltera.setInt(6, this.usuarioAltera.getId());
            consultaAltera.executeUpdate();
            consultaAltera.close();//fechando consulta
            entradaArquivo.close();
            //tratando as 3 exçeções possiveis que podem surgir sem o tratamento de exçeção geral com throws    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro ao salvar sua alteração!");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "problema ao alterar sua foto de perfil!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Problema ao alterar sua foto!");
        }
    }

    //metodo que vai excluir uma pessoa qualquer com id informado, do BD 
    //lembrando trata a exceção que der como uma qualquer como uma exceção geral, aqui so verifica qual e a exceção e manda para que 
    //chamou esse metodo tratar ela la
    public void excluiUsuario() throws SQLException {
        PreparedStatement consultaDeleta = this.conectar1.prepareStatement("DELETE FROM pessoa WHERE codigo_id = ?");
        //setando na consulta o id da pessoa que vou apagar
        //este id esta contido no atributo de tipo usuario que vem por parametro ao istanciar essa classe
        consultaDeleta.setInt(1, this.usuarioAltera.getId());
        consultaDeleta.executeUpdate();
        consultaDeleta.close();
    }

    //FAZENDO MODIFICAÇÕES NO METODO DE INSERIR UM NOVO USUARIO
    /*metodo que fas inserir dados em um banco de dados, não tem parametros esse metodo*/                         //trata uma exception de qualquer tipo que der e manda para quem chamar ele a exception
    public void cadastrarUsuarioComFotoPerfil(String nome, String email, String senha, String telefone, String cidade_estado, File fotoPerfil) throws SQLException {

        //aqui no try e onde eu digo oque eu vou fazer, oque esse try vai avaliar para ver se o cath acha o erro, e trata o erro ou exceção
        //um objeto que armazenara a consulta que sera realizada ao banco de dados,atraves dele chego ao banco de dados fazendo uma conuslta
        PreparedStatement consultaInseri = this.conectar1.prepareStatement("INSERT INTO pessoa(nome, email, senha, telefone, cidade_estado,foto_perfil) VALUES ( ?, ?, ?, ?, ?, ?);"); //Cria um objeto PreparedStatement para enviar instruções SQL com parâmetros para o banco de dados.
        //so acesso o metodo de consulta atraves de um objeto de tipo conexão.    //acima uma consulta de inserção de dados ao banco de dados atraves do metodo prepareStatement vindo por meio do objeto conexão

        //como minha consulta tem parametros e valores a serem passados para o banco de dados eu tenho que
        //receber os dados via parametro pela função inserir e passar os parametros a minha consulta em seus respectivos campos na consulta no caso os campos de interrogação
        // tenho que preenche pega os valores que vem por parametros do metodo inserir e passar a consulta em cada campo
        // por ordem e tem metodos para fazer isso veja abaixo:
        //consultaInseri.setInt(1,3);
        consultaInseri.setString(1, nome); //inserindo o parametro nome, a o  campo nome da consulta sql
        consultaInseri.setString(2, email); //inserindo o parametro email, ao campo email da consulta sql
        consultaInseri.setString(3, senha); //inserindo o parametro senha, ao campo senha da consulta sql
        consultaInseri.setString(4, telefone); //inserindo o parametro telefone, ao campo telefone da consulta sql
        consultaInseri.setString(5, cidade_estado); //inserindo o parametro cidade_estado, ao campo cidade_estado da consulta sql
        //bytesImagem;
        //tratando a imagem para setar na consulta
        try {
            //lendo os bytes da imagem 
            FileInputStream bytesImagem = new FileInputStream(fotoPerfil);
            //setando a imagem na consulta
            consultaInseri.setBinaryStream(6, bytesImagem, (int) fotoPerfil.length());
            consultaInseri.executeUpdate(); //executa a consulta de inserção 
            bytesImagem.close();//fecha o inputstream
        } catch (IOException e) {
            //exception que trata entrada e saida, com arquivos ou do console   
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao trabalhar com sua foto de Perfil!");
        }
        consultaInseri.close();//fecha a consulta
    }

}
