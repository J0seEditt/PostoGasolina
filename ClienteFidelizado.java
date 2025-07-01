package posto;

class ClienteFidelizado extends Cliente {
    private int nivelFidelidade;
    private double descontoFidelidade;

    public ClienteFidelizado(String nome, String cpf, String telefone, double saldo, int nivelFidelidade) {
        super(nome, cpf, telefone, saldo, "Fidelizado");
        this.nivelFidelidade = nivelFidelidade;
        this.descontoFidelidade = nivelFidelidade * 0.05; // 5% por nível
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente Fidelizado: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Nível de Fidelidade: " + nivelFidelidade);
        System.out.println("Desconto: " + (descontoFidelidade * 100) + "%");
    }

    @Override
    public void realizarCompra(double valor) {
        double valorComDesconto = valor * (1 - descontoFidelidade);
        if (saldo >= valorComDesconto) {
            saldo -= valorComDesconto;
            System.out.println("Compra realizada com desconto de fidelidade!");
            System.out.println("Valor original: R$ " + valor);
            System.out.println("Valor com desconto: R$ " + valorComDesconto);
            System.out.println("Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a compra.");
        }
    }

    @Override
    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println("Saldo adicionado! Novo saldo: R$ " + saldo);
    }

   
    public int getNivelFidelidade() {
        return nivelFidelidade;
    }
    
    public void setNivelFidelidade(int nivelFidelidade) {
        this.nivelFidelidade = nivelFidelidade;
        this.descontoFidelidade = nivelFidelidade * 0.05;
    }
    
    public double getDescontoFidelidade() {
        return descontoFidelidade;
    }
}
