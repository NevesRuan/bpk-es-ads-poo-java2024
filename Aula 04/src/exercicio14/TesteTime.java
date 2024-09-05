package exercicio14;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid", "Carlo Ancelotti", 11);

        System.out.println(time);

        time.adicionarJogador();
        time.removerJogador();
    }
}
