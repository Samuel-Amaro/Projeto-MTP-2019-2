package meuprimeirojframe;
//classe de tipo like post, vai servir para popular um like dado em um post e repassalo para frente em forma de objeto

import java.sql.Date;
import java.time.LocalDate;

public class PupularLikePost {
//atributos
int fk_Pessoa_Deu_Like;
int fk_post;
int id_like;
//vai ser um atributo de tipo data do tipo do banco de dados da tabela do like
Date dataDoDia; 
//osb para pegar data do sistema via local e //java.time.LocalDate.now();//so passar por parametro para setar
//para converter para o tipo date java.sql.Date.valueOf(java.time.LocalDate.now()) //para mandar para o banco de dados

//geter e seter
    public int getFk_Pessoa_Deu_Like() {
        return fk_Pessoa_Deu_Like;
    }

    public void setFk_Pessoa_Deu_Like(int fk_Pessoa_Deu_Like) {
        this.fk_Pessoa_Deu_Like = fk_Pessoa_Deu_Like;
    }

    public int getFk_post() {
        return fk_post;
    }

    public void setFk_post(int fk_post) {
        this.fk_post = fk_post;
    }

    public int getId_like() {
        return id_like;
    }

    public void setId_like(int id_like) {
        this.id_like = id_like;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }

    public void setDataDoDia(Date dataDoDia) {
        this.dataDoDia = dataDoDia;
    }

}
