
package meuprimeirojframe;

import java.sql.Connection;
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
	public ConexaoBancoDeDados() {
		conectar();
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
           e1.printStackTrace();
        }
       
        //propriedades do banco de dados, que são necessarias para conectarem
        Properties propriedade = new Properties();
        propriedade.setProperty("user",this.usuario); //propriedade de usuario
        propriedade.setProperty("password",this.senha); //propriedade senha
        
        //tentando fazer conexão, o metodo que fas conexão com banco de dados realmente
        try {
            this.conectar1 = DriverManager.getConnection(this.endereco, propriedade);//gerencia o driver e cria uma conexão com o banco.
                    //DriverManager //classe estatica, não precisa de istanciar um objeto
        } catch (SQLException e) { //recebe uma exceção da biblioteca do javaSql
               //se não conseguir executa isso
               e.printStackTrace();
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
	 * @return um objeto Connection para  a conexÃ£o feita com o BD
	 */
    
    
        //metodo que fas um login OU SO FAS UM SELECT E RETORNA UM NOME DE UMA PESSOA TIPO STRING ao banco de daddos ele pega oque o cara digitou e verifica se esta la e existe, e retorna um nome
        public String login(String email,String senha) {
            try {
                //ps e um objeto que vai receber a consulta preparada, no caso de um select do banco de dados
                PreparedStatement ps = this.conectar1.prepareStatement("SELECT codigo_id,nome FROM pessoa WHERE email = ? AND senha = ?;");
                //adicionsndo oque o cara digitar no login ao ponto de interrogação,que vem por meio de parametro do metodo
                ps.setString(1,email); //adiciona os dados vindo por meio do parametro ao primeiro ponto de interrogação 
                ps.setString(2,senha); //mesma coisa so que ao segundo ponto de interrogação
                //(os numeros no argumento do set são pela ordem do ponto de interrogação)
                ResultSet executor = ps.executeQuery();
                //executando uma consulta o select e guardo o resultado da execuçaõ em um objeto executor
                if(executor.next()) { //verifica se o meu objeto de tipo Result que tem o resultado da consulta,  tem algum resultado se tem algo dentro dele
                   return  executor.getString(2); //retorna um dado de uma consulta o parametro e o campo que quero saber da minha consulta  //retorna um segundo campo da minha consulta que no caso e um nome
                   //tem que chamar de seu respectivo tipo e a função em si no caso tem que retorna um mesmo tipo do get 
                } else {
                       return null;
                }
            } catch (Exception e) {
                  e.printStackTrace();
            }
            return null;
        }
	public Connection getConnection() {
		return this.conectar1;
	}
        
        /*metodo que fas inserir dados em um banco de dados, não tem parametros esse metodo*/
        public void inserirIntoDataBase(String nome,String email,String senha,  String telefone,String cidade_estado) {
            try {
            //aqui no try e onde eu digo oque eu vou fazer, oque esse try vai avaliar para ver se o cath acha o erro, e trata o erro ou exceção
            //um objeto que armazenara a consulta que sera realizada ao banco de dados,atraves dele chego ao banco de dados fazendo uma conuslta
            PreparedStatement consultaInseri = this.conectar1.prepareStatement("INSERT INTO pessoa(nome, email, senha, telefone, cidade_estado) VALUES ( ?, ?, ?, ?, ?);"); //Cria um objeto PreparedStatement para enviar instruções SQL com parâmetros para o banco de dados.
            //so acesso o metodo de consulta atraves de um objeto de tipo conexão.    //acima uma consulta de inserção de dados ao banco de dados atraves do metodo prepareStatement vindo por meio do objeto conexão
            
            //como minha consulta tem parametros e valores a serem passados para o banco de dados eu tenho que
            //receber os dados via parametro pela função inserir e passar os parametros a minha consulta em seus respectivos campos na consulta no caso os campos de interrogação
            // tenho que preenche pega os valores que vem por parametros do metodo inserir e passar a consulta em cada campo
            // por ordem e tem metodos para fazer isso veja abaixo:
            //consultaInseri.setInt(1,3);
            consultaInseri.setString(1,nome); //inserindo o parametro nome, a o  campo nome da consulta sql
            consultaInseri.setString(2,email); //inserindo o parametro email, ao campo email da consulta sql
            consultaInseri.setString(3,senha); //inserindo o parametro senha, ao campo senha da consulta sql
            consultaInseri.setString(4,telefone); //inserindo o parametro telefone, ao campo telefone da consulta sql
            consultaInseri.setString(5,cidade_estado); //inserindo o parametro cidade_estado, ao campo cidade_estado da consulta sql
            consultaInseri.executeUpdate(); //cancela uma consulta qualquer se tiver qualquer exception
            consultaInseri.close(); //fecha os recursos de uma istrução qualquer apos encerrada normalmente
            } catch (Exception e) {
                //tratando uma exceção ou erro que der
                 e.printStackTrace(); //mostra a propria exceção
            }
  
        }

    
}
    

