package exercicio01;

public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroDePaginas;
    private Boolean aberto = false;
    private Integer paginaAtual = 1;

    public Livro(String titulo, String autor, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }

    public void abrirLivro() {
        this.aberto = true;
    }

    public void lerPagina() {
        if (paginaAtual.equals(numeroDePaginas)) {
            System.out.println("Você chegou ao final do livro!");
        } else {
            paginaAtual++;
        }
    }
}
