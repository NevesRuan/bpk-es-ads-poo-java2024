package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private Integer duracao; // em minutos

    public Filme(String titulo, String diretor, Integer duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void iniciar() {
        System.out.println("Filme iniciado.");
    }

    public void parar() {
        System.out.println("Filme parado.");
    }
}
