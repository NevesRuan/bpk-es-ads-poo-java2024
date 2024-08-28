package exercicio15;

public class Jogo {
    private String nome;
    private String genero;
    private Double preco;

    public Jogo(String nome, String genero, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("Jogo iniciado.");
    }

    public void pausar() {
        System.out.println("Jogo pausado.");
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
