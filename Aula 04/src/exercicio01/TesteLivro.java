package exercicio01;
public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000);
        livro.abrirLivro();
        livro.lerPagina();
        System.out.println("Página atual: " + livro.getPaginaAtual());
    }
}
