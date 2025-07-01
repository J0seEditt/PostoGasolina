package posto;

class Gerente extends Pessoa {
    private String departamento;
    private double salario;
    private int anosExperiencia;

    public Gerente(String nome, String cpf, String telefone, String departamento, double salario, int anosExperiencia) {
        super(nome, cpf, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Anos de Experiência: " + anosExperiencia);
    }

    public void gerenciarEquipe() {
        System.out.println("Gerente " + nome + " está gerenciando a equipe do departamento " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
}