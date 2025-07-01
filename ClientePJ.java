package posto;

class ClientePJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String nome, String cpf, String telefone, double saldo,
                     String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(nome, cpf, telefone, saldo, "Pessoa Jurídica");
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente Pessoa Jurídica: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Telefone: " + telefone);
        System.out.println("Saldo: R$ " + saldo);
    }

    @Override
    public void realizarCompra(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Compra empresarial realizada!");
            System.out.println("Valor: R$ " + valor);
            System.out.println("Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a compra.");
        }
    }

    @Override
    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println("Saldo empresarial adicionado! Novo saldo: R$ " + saldo);
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

}
