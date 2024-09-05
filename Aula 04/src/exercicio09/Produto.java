package exercicio09;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void aumentarEstoque(Integer quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void diminuirEstoque(Integer quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
