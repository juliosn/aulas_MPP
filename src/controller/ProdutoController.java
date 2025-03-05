package controller;

import model.Produto;

// Controlador (Controller) - Gerencia a lógica entre Model e View
public class ProdutoController {
    private Produto produto;

    public ProdutoController(Produto produto) {
        this.produto = produto;
    }

    public void atualizarPreco(double novoPreco) {
        produto.setPreco(novoPreco);
    }

    public Produto getProduto() {
        return produto;
    }
}
