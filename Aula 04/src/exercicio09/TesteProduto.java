package exercicio09;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0, 10);

        System.out.println(produto);

        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
    }
}
