package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Gourmet", 4, "Branca");

        System.out.println(cozinha);

        cozinha.cozinhar();
        cozinha.limpar();
    }
}
