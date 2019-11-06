package meuprimeirojframe;

//classe do post vai servir para popular o post em qualquer lugar

import java.sql.Date;

//de uma tela para outra
public class ClassePost {

//atributos    
private int id_post;
private int fk_pessoa;
private String descricao;
private  byte[] binarioImagem;
private int numeroLikes;
private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }
    
    //get e seter
    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getFk_pessoa() {
        return fk_pessoa;
    }

    public void setFk_pessoa(int fk_pessoa) {
        this.fk_pessoa = fk_pessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getBinarioImagem() {
        return binarioImagem;
    }

    public void setBinarioImagem(byte[] binarioImagem) {
        this.binarioImagem = binarioImagem;
    }
}
