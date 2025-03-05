import controller.ProdutoController;
import model.Produto;
import model.ProdutoPromocional;
import view.ProdutoView;

// Programa principal para demonstrar o funcionamento
public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto = new Produto("Notebook", 3000.00);

        // Criando um controlador para o produto
        ProdutoController controller = new ProdutoController(produto);

        // Criando uma view para exibir os detalhes
        ProdutoView view = new ProdutoView();

        // Exibindo os detalhes iniciais do produto
        view.exibirDetalhesProduto(produto);

        // Atualizando o preço do produto
        controller.atualizarPreco(2800.00);
        System.out.println("\nApós atualização de preço:");
        view.exibirDetalhesProduto(produto);

        // Criando um produto promocional
        ProdutoPromocional produtoPromo = new ProdutoPromocional("Smartphone", 2000.00, 10);

        // Exibindo o preço com desconto
        System.out.println("\nProduto Promocional: " + produtoPromo.getNome());
        System.out.println("Preço Original: R$ " + produtoPromo.getPreco());
        System.out.println("Preço com Desconto: R$ " + produtoPromo.getPrecoComDesconto());
    }
}
