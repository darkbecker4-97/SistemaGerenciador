    public class Loja {
       // estes são os produtos disponiveis
        private Produto produto1;
        private Produto produto2;
        private Produto produto3;
        // atribui o "Produto" a uma das variáveis que esteja vazia
        public void adicionarProduto(Produto produto) {
            if (produto1 == null) {
                produto1 = produto;
            } else if (produto2 == null) {
                produto2 = produto;
            } else if (produto3 == null) {
                produto3 = produto;
            } else {
                System.out.println("Não é possível adicionar mais produtos!");
            }
        }
        // remove da lista de produtos disponíveis, null a uma das variáveis que tenha algo para ser removido
        public void removerProduto(Produto produto) {
            if (produto1 != null && produto1.equals(produto)) {
                produto1 = null;
            } else if (produto2 != null && produto2.equals(produto)) {
                produto2 = null;
            } else if (produto3 != null && produto3.equals(produto)) {
                produto3 = null;
            } else {
                System.out.println("Produto não encontrado!");
            }
        }
        // mostra todos os produtos disponíveis e suas infos
        public void listarProdutos() {
            if (produto1 != null) {
                System.out.println(produto1.getNome());
            }
            if (produto2 != null) {
                System.out.println(produto2.getNome());
            }
            if (produto3 != null) {
                System.out.println(produto3.getNome());
            }
        }
        // quantidade a ser vendida se produto estiver disponível  venda é realizada, diminuindo a quantidade em estoque do produto.
        public void venderProduto(Produto produto, int quantidade) {
            if (produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Quantidade em estoque insuficiente!");
            }
        }
        // atraves de um obj da class Produto recebe a quantidade para adicionar em estoque,sendo atualizado a cada inserção de produto
        public void adicionarEstoque(Produto produto, int quantidade) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado com sucesso!");
        }
    }
