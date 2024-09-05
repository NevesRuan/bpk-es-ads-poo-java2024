package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Jorge Jesus", 11);
        time.adicionarJogador();
        time.removerJogador();
        System.out.println("Número de jogadores: " + time.getNumeroDeJogadores());
    }
}
