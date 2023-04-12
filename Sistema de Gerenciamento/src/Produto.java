    public class Produto {
        // privados,  só podem ser acessados por métodos dentro da classe.
        private String nome;
        private double preco;
        private int quantidade;
        // recebe os valores iniciais para os atributos "nome", "preco" e "quantidade" e inicializa com esses valores.
        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
        // retorna o valor atual do atributo nome
        public String getNome() {
            return nome;
        }
        //o set recebe um novo valor para o atributo nome e atualiza.
        public void setNome(String nome) {
            this.nome = nome;
        }
        // o get retorna o valor atual do atributo "preco"
        public double getPreco() {
            return preco;
        }
        // recebe um novo valor para o atributo "preco" e o atualiza.
        public void setPreco(double preco) {
            this.preco = preco;
        }
        // o get retorna o valor atual do atributo quantidade
        public int getQuantidade() {
            return quantidade;
        }
        // O set recebe um novo valor para o atributo
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }
