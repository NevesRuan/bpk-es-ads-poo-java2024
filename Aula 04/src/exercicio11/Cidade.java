package exercicio11;

public class Cidade {
    private String nome;
    private Integer populacao;
    private String estado;

    public Cidade(String nome, Integer populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(Integer quantidade) {
        populacao += quantidade;
        System.out.println("População aumentada. População atual: " + populacao);
    }

    public void diminuirPopulacao(Integer quantidade) {
        if (quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("População diminuída. População atual: " + populacao);
        } else {
            System.out.println("A quantidade de diminuição é maior que a população atual.");
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
