package posto;

class ClienteComum extends Cliente {
    private int pontosAcumulados;

    public ClienteComum(String nome, String cpf, String telefone, double saldo) {
        super(nome, cpf, telefone, saldo, "Comum");
        this.pontosAcumulados = 0;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente Comum: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Pontos Acumulados: " + pontosAcumulados);
    }

    @Override
    public void realizarCompra(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            pontosAcumulados += (int)(valor / 10);
            System.out.println("Compra realizada! Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a compra.");
        }
    }

    @Override
    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println("Saldo adicionado! Novo saldo: R$ " + saldo);
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }
    
    public void setPontosAcumulados(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }
    
}