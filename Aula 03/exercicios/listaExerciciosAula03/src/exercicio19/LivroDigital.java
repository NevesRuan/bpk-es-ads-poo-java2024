package exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private Double tamanhoArquivo; // em MB
    private Boolean aberto = false;

    public LivroDigital(String titulo, String autor, Double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Livro digital aberto.");
        } else {
            System.out.println("O livro digital já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Livro digital fechado.");
        } else {
            System.out.println("O livro digital já está fechado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public Boolean isAberto() {
        return aberto;
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                ", aberto=" + aberto +
                '}';
    }
}
