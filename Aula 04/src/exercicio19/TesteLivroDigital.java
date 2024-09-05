package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Clean Code", "Robert C. Martin", 5.0);
        livroDigital.abrir();
        livroDigital.fechar();
    }
}
