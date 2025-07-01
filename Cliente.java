package posto;

public abstract class Cliente extends Pessoa {
    protected double saldo;
    protected String tipoCliente;

    public Cliente(String nome, String cpf, String telefone, double saldo, String tipoCliente) {
        super(nome, cpf, telefone);
        this.saldo = saldo;
        this.tipoCliente = tipoCliente;
    }

    public abstract void realizarCompra(double valor);
    public abstract void adicionarSaldo(double valor);

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTipoCliente() {
        return tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
}