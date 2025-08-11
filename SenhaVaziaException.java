package posto;

public class SenhaVaziaException extends RuntimeException {
    public SenhaVaziaException() {
          super("O campo de senha está vazio!");
    }
    public SenhaVaziaException(String mensage) {
      super(mensage);
    }
}
