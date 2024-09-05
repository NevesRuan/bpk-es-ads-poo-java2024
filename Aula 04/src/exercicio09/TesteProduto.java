package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}
