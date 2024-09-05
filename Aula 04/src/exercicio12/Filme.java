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

    public void iniciar() {
        System.out.println("Filme iniciado.");
    }

    public void parar() {
        System.out.println("Filme parado.");
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

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
