package exercicio21;

public class Cozinha {
    private String tipo;
    private Integer quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, Integer quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando...");
    }

    public void limpar() {
        System.out.println("Cozinha limpa.");
    }
}
