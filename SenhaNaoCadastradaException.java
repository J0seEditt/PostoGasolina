package posto;

public class SenhaNaoCadastradaException extends RuntimeException {
    public SenhaNaoCadastradaException() {
        super("Nenhuma senha cadastrada para este usuário!");
    }
    public SenhaNaoCadastradaException(String mensage) {
      super(mensage);
  }
}
