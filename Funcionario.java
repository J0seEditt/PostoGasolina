package posto;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String cpf, String telefone, String cargo, double salario, String dataAdmissao, String senha) {
        super(nome, cpf, telefone, senha);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Data de Admissão: " + dataAdmissao);
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario; }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
}