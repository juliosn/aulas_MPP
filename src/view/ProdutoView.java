package view;

import model.Produto;

// Visão (View) - Responsável por exibir os dados ao usuário
public class ProdutoView {
    public void exibirDetalhesProduto(Produto produto) {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
    }
}

