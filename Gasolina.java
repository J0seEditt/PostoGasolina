package posto;

class Gasolina extends Produto {
    private String tipo;
    private double octanagem;

    public Gasolina(String nome, double preco, int quantidade, String tipo, double octanagem) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
        this.octanagem = octanagem; //é uma medida da resistência de um combustível à detonação não se é uma boa colocar um valor fixo :(
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço por litro: R$ " + preco);
        System.out.println("Quantidade disponível: " + quantidade + " litros");
        System.out.println("Octanagem: " + octanagem);
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
    
    public double getOctanagem() {
        return octanagem;
    }
    
    public void setOctanagem(double octanagem) {
        this.octanagem = octanagem;
    }
    
}
