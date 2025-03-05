package model;

// Herança e Polimorfismo: a classe ProdutoPromocional herda de Produto e implementa Desconto
public class ProdutoPromocional extends Produto implements Desconto {
    private double percentualDesconto;

    public ProdutoPromocional(String nome, double preco, double percentualDesconto) {
        super(nome, preco);
        this.percentualDesconto = percentualDesconto;
    }

    // Implementação do método da interface (Polimorfismo)
    @Override
    public double aplicarDesconto(double preco) {
        return preco - (preco * percentualDesconto / 100);
    }

    // Método específico para obter o preço com desconto
    public double getPrecoComDesconto() {
        return aplicarDesconto(getPreco());
    }
}
