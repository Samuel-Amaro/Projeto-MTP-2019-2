//classe que ira criptografar a senha do banco de dados em MD5
package meuprimeirojframe;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class CriptografaSenha {

    private String senha;
    //metodo que vai criptografar a senha

    public static String CriptografaSenhaMd5(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            return String.format("%32x", hash);
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "erro ao criptografar sua senha");
        }

        return null;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
