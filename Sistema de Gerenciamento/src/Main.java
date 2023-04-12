public class Main {
    public static void main(String[] args) {
        // criação dos objetos Produto
        Produto produto1 = new Produto("Caneta", 2.5, 10);
        Produto produto2 = new Produto("Caderno", 8.0, 5);
        Produto produto3 = new Produto("Lápis", 1.5, 20);

        // criação do objeto Loja
        Loja loja = new Loja();

        // adição dos produtos à loja
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        // listagem dos produtos disponíveis na loja
        System.out.println("Produtos disponíveis na loja:");
        loja.listarProdutos();

        // venda de um produto
        Produto produtoVendido = produto1;
        int quantidadeVendida = 3;
        System.out.println("\nVenda de " + quantidadeVendida + " unidades de " + produtoVendido.getNome() + "...");
        loja.venderProduto(produtoVendido, quantidadeVendida);

        // listagem dos produtos disponíveis na loja após a venda
        System.out.println("\nProdutos disponíveis na loja após a venda:");
        loja.listarProdutos();

        // adição de estoque a um produto
        Produto produtoEstoque = produto2;
        int quantidadeEstoque = 10;
        System.out.println("\nAdição de " + quantidadeEstoque + " unidades de " + produtoEstoque.getNome() + " ao estoque...");
        loja.adicionarEstoque(produtoEstoque, quantidadeEstoque);

        // listagem dos produtos disponíveis na loja após a adição de estoque
        System.out.println("\nProdutos disponíveis na loja após a adição de estoque:");
        loja.listarProdutos();

        // remoção de um produto da loja
        Produto produtoRemovido = produto3;
        System.out.println("\nRemoção do produto " + produtoRemovido.getNome() + " da loja...");
        loja.removerProduto(produtoRemovido);

        // listagem dos produtos disponíveis na loja após a remoção
        System.out.println("\nProdutos disponíveis na loja após a remoção:");
        loja.listarProdutos();
    }
}