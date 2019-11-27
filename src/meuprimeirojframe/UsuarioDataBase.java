//classe do tipo usuario do tipo da tabela do banco de dados
// e a unica coisa que entre as telas tem em comun e essa classe
// essa classe e para armazenar um objeto do tipo usuario para armazenar tudo que um cara acabou de logar
package meuprimeirojframe;

public class UsuarioDataBase{
  
  //atributos da classe
  private Integer id;
  private String nome;
  private String email;
  private String telefone;
  private String cidadeEstado;
  private String Senha;
  private byte[] binarioFotoPerfil;//faz parte do extra nota extra
    
  //metodo especial get e set dos atributos
    public Integer getId() {
        return id;
    }

    public byte[] getBinarioFotoPerfil() {
        return binarioFotoPerfil;
    }

    public void setBinarioFotoPerfil(byte[] binarioFotoPerfil) {
        this.binarioFotoPerfil = binarioFotoPerfil;
    }

    public void setId(Integer id) {
        this.id = id;
    } 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidadeEstado() {
        return cidadeEstado;
    }

    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
