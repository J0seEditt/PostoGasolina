package posto;

public interface AutenticarSenha {

    boolean autenticar(String senha) throws SenhaIncorretaException;
}
