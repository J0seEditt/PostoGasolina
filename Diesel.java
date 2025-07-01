package posto;

class Diesel extends Produto {
    private String tipo;
    private double densidade;

    public Diesel(String nome, double preco, int quantidade, String tipo, double densidade) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
        this.densidade = densidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço por litro: R$ " + preco);
        System.out.println("Quantidade disponível: " + quantidade + " litros");
        System.out.println("Densidade: " + densidade + " kg/m³");
    }

    @Override
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getDensidade() {
        return densidade;
    }
    
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
    
}
