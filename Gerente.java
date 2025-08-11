package posto;

class Gerente extends Pessoa implements AutenticarSenha {
    private String departamento;
    private double salario;
    private int anosExperiencia;
    private String senha;

    public Gerente(String nome, String cpf, String telefone, String departamento, double salario, int anosExperiencia, String senha) {
        super(nome, cpf, telefone, senha);
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
        System.out.println("Sua senha é : " + senha);
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public boolean autenticar(String senha) throws SenhaIncorretaException {
        if (this.senha == null) {
            throw new SenhaNaoCadastradaException();
        }
        if (senha == null || senha.isEmpty()) {
            throw new SenhaVaziaException();
        }
        if (!this.senha.equals(senha)) {
            throw new SenhaIncorretaException();
        }
        return true;
    }
}