package exercicio15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 199.99);
        jogo.iniciar();
        jogo.pausar();
    }
}
